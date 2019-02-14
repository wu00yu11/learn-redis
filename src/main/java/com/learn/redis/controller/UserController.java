package com.learn.redis.controller;

import com.alibaba.fastjson.JSON;
import com.learn.redis.model.User;
import com.learn.redis.service.RedisService;
import com.learn.redis.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 *
 * @author zjj
 * @date 2019/2/14 0014
 */
@RestController
public class UserController {
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);
    @Resource
    private UserService userService;

    @Autowired
    private RedisService redisService;

    @RequestMapping(value = "/getUser",method = RequestMethod.GET)
    public User showUser(String id){
        User user = null;
        int userId = Integer.parseInt(id);
        String result = redisService.get("user");
        if(result==null) {
            user = this.userService.getUserById(userId);
            logger.info("来自数据库："+user.getName());
            redisService.set("user", JSON.toJSONString(user));
        }else {
            user = JSON.parseObject(result, User.class);
            logger.info("来自redis缓存："+result);
        }
        return user;
    }

    @RequestMapping(value = "/showAll",method = RequestMethod.GET)
    public List<User> showListUser() {
        List<User> userList = null;
        String result = redisService.get("userList");
        if(result==null){
            userList = userService.selectAllUser();
            logger.info("来自数据库："+userList);
            redisService.set("userList",JSON.toJSONString(userList));
        }else {
            userList = JSON.parseArray(result, User.class);
            logger.info("来自redis缓存："+result);
        }
        logger.info(userList.toString());
        return  userList;
    }
}

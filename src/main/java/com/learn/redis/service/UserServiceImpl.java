package com.learn.redis.service;

import com.learn.redis.dao.UserDao;
import com.learn.redis.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * @author zjj
 * @date 2019/2/14 0014
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(int id) {
        return this.userDao.getUserById(id);
    }

    @Override
    public List<User> selectAllUser() {
        return this.userDao.getAllUser(null);
    }
}

package com.learn.redis.service;

import com.learn.redis.model.User;

import java.util.List;

/**
 *
 * @author zjj
 * @date 2019/2/14 0014
 */
public interface UserService {
    User getUserById(int id);

    List<User> selectAllUser();
}

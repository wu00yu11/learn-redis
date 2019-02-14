package com.learn.redis.dao;

import com.learn.redis.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 *
 * @author zjj
 * @date 2019/2/14 0014
 */
@Repository
public interface UserDao {

    List<User> getAllUser(User user);

    User getUserById(Integer id);

    void add(User user);

    void update(User user);

    void delete(Integer id);
}

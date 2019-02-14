package com.learn.redis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

/**
 *
 * @author zjj
 * @date 2019/2/14 0014
 */
@Service
public class RedisServiceImpl implements RedisService {

    @Autowired
    private RedisTemplate redisTemplate;
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Override
    public String get(String ars) {
        return stringRedisTemplate.opsForValue().get(ars);
    }

    @Override
    public void set(String user, String value) {
        stringRedisTemplate.opsForValue().set(user,value);
    }
}

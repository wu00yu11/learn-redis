package com.learn.redis.service;

/**
 *
 * @author zjj
 * @date 2019/2/14 0014
 */
public interface RedisService {

    String get(String ars);

    void set(String user, String value);

}

package com.learn.redis.model;

import lombok.Data;

import java.io.Serializable;

/**
 *
 * @author zjj
 * @date 2019/2/13 0013
 */
@Data
public class User implements Serializable {

    private static final long serialVersionUID = 121959162708813585L;

    private Integer id;
    private String name;
    private String addr;
    private Integer age;
}

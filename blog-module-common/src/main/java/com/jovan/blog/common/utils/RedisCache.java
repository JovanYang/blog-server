/*
package com.jovan.blog.common.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

*/
/**
 * Redis缓存工具类
 *//*

@Component
public class RedisCache {
    
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    
    */
/**
     * 缓存基本的对象
     *//*

    public <T> void setCacheObject(String key, T value, Integer timeout, TimeUnit timeUnit) {
        redisTemplate.opsForValue().set(key, value, timeout, timeUnit);
    }
    
    */
/**
     * 获得缓存的基本对象
     *//*

    public <T> T getCacheObject(String key) {
        return (T) redisTemplate.opsForValue().get(key);
    }
    
    */
/**
     * 删除单个对象
     *//*

    public boolean deleteObject(String key) {
        return redisTemplate.delete(key);
    }
} */

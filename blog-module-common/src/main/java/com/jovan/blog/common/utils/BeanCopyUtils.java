package com.jovan.blog.common.utils;

import org.springframework.beans.BeanUtils;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Bean拷贝工具类
 */
public class BeanCopyUtils {
    
    /**
     * 单个对象拷贝
     */
    public static <V> V copyBean(Object source, Class<V> clazz) {
        V result = null;
        try {
            result = clazz.newInstance();
            BeanUtils.copyProperties(source, result);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    
    /**
     * 集合对象拷贝
     */
    public static <O, V> List<V> copyBeanList(List<O> list, Class<V> clazz) {
        if (CollectionUtils.isEmpty(list)) {
            return new ArrayList<>();
        }
        return list.stream()
                .map(o -> copyBean(o, clazz))
                .collect(Collectors.toList());
    }
} 
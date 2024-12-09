package com.jovan.blog.common.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author: Jovan
 * @date: 2024/12/9
 * @description: Mybatis Plus 配置文件
 */
@Configuration
@MapperScan(basePackages = "com.jovan.blog.common.domain.mapper")
public class MybatisPlusConfig {
}

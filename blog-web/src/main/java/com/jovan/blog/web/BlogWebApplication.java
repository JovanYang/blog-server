package com.jovan.blog.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author: Jovan
 * @date: 2024/12/8
 * @description:
 */
@SpringBootApplication
@ComponentScan({"com.jovan.blog"})
public class BlogWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(BlogWebApplication.class, args);
    }
}




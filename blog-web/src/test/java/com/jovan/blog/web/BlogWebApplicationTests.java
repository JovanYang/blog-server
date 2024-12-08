package com.jovan.blog.web;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author: Jovan
 * @date: 2024/12/8
 * @description:
 */
@SpringBootTest
@Slf4j
public class BlogWebApplicationTests {
    @Test
    public void test() {
        // 编写单元测试
    }

    @Test
    void contextLoads() {
    }

    @Test
    void testLog() {
        log.info("这是一行 Info 级别日志");
        log.warn("这是一行 Warn 级别日志");
        log.error("这是一行 Error 级别日志");

        // 占位符
        String author = "Jovan";
        log.info("这是一行带有占位符日志，作者：{}", author);
    }
}

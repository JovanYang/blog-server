package com.jovan.blog.jwt.exception;

import org.springframework.security.core.AuthenticationException;

/**
 * @author: Jovan
 * @date: 2024/12/10
 * @description: 用户名或密码为空异常
 */
public class UsernameOrPasswordNullException extends AuthenticationException {
    public UsernameOrPasswordNullException(String msg, Throwable cause) {
        super(msg, cause);
    }

    public UsernameOrPasswordNullException(String msg) {
        super(msg);
    }
}

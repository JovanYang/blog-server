/*
package com.jovan.blog.common.utils;

import com.blog.model.security.LoginUser;
import org.springframework.security.core.context.SecurityContextHolder;

public class SecurityUtils {
    
    public static Long getCurrentUserId() {
        LoginUser loginUser = (LoginUser) SecurityContextHolder.getContext()
                .getAuthentication()
                .getPrincipal();
        return loginUser.getUser().getId();
    }
    
    public static String getCurrentUsername() {
        LoginUser loginUser = (LoginUser) SecurityContextHolder.getContext()
                .getAuthentication()
                .getPrincipal();
        return loginUser.getUsername();
    }
} */

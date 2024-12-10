package com.jovan.blog.jwt.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @author: Jovan
 * @date: 2024/12/10
 * @description:
 */
@Service
@Slf4j
public class UserDetailServiceImpl implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        return User.withUsername("Jovan")
                .password("123456")
                .authorities("ADMIN")
                .build();
    }
}

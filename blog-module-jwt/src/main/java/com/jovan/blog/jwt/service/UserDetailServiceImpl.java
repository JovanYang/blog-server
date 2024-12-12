package com.jovan.blog.jwt.service;

import com.jovan.blog.common.domain.dos.UserDO;
import com.jovan.blog.common.domain.dos.UserRoleDO;
import com.jovan.blog.common.domain.mapper.UserRoleMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @author: Jovan
 * @date: 2024/12/10
 * @description:
 */
@Service
@Slf4j
public class UserDetailServiceImpl implements UserDetailsService {

    @Autowired
    private UserRoleMapper userRoleMapper;

    @Autowired
    private UserDO userDO;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        // 判断用户是否存在
        if(Objects.isNull(userDO)){
            throw new UsernameNotFoundException("用户不存在");
        }

        // 用户角色
        List<UserRoleDO> roleDOS = userRoleMapper.selectByUsername(username);

        String[] roleArr = null;

        if(!CollectionUtils.isEmpty(roleDOS)){
            List<String> roles = roleDOS.stream().map(UserRoleDO::getRole).collect(Collectors.toList());
            roleArr = roles.toArray(new String[roles.size()]);
        }
        return User.withUsername(userDO.getUsername())
                .password(userDO.getPassword())
                .authorities(roleArr)
                .build();
    }
}

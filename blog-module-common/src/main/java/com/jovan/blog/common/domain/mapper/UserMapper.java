package com.jovan.blog.common.domain.mapper;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jovan.blog.common.domain.dos.UserDO;

/**
 * @author: Jovan
 * @date: 2024/12/9
 * @description: 
 */
public interface UserMapper extends BaseMapper<UserDO> {

    /**
     * 根据用户名查询用户信息
     *
     * @param username 用户名，用于查询用户信息
     * @return 返回查询到的用户信息对象，如果没有找到则返回null
     */
    default UserDO findByUsername(String username) {
        // 创建一个Lambda查询包装器，用于构建查询条件
        LambdaQueryWrapper<UserDO> wrapper = new LambdaQueryWrapper<>();
        // 设置查询条件，匹配用户名与参数username相同
        wrapper.eq(UserDO::getUsername, username);
        // 执行查询并返回结果，如果有多条记录则抛出异常
        return selectOne(wrapper);
    }
}

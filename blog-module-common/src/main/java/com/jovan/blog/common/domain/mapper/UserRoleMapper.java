package com.jovan.blog.common.domain.mapper;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jovan.blog.common.domain.dos.UserRoleDO;

import java.util.List;

/**
 * @author: Jovan
 * @date: 2024/12/12
 * @description:
 */
public interface UserRoleMapper extends BaseMapper<UserRoleDO> {
    /**
     * 根据用户名选择用户角色列表
     *
     * @param username 用户名，用于查询用户角色
     * @return 用户角色列表，如果用户名不存在或没有对应的角色，则返回空列表
     */
    default List<UserRoleDO> selectByUsername(String username) {
        // 创建一个Lambda查询包装器，用于构建查询条件
        LambdaQueryWrapper<UserRoleDO> wrapper = new LambdaQueryWrapper<>();
        // 设置查询条件为用户名等于传入的username参数
        wrapper.eq(UserRoleDO::getUsername, username);

        // 执行查询并返回结果列表
        return selectList(wrapper);
    }
}

package com.jovan.blog.common.enums;

import com.jovan.blog.common.exception.BaseExceptionInterface;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 错误码枚举
 */
@Getter
@AllArgsConstructor
public enum ResponseCodeEnum implements BaseExceptionInterface {
    
    /*SUCCESS(200, "操作成功"),
    PARAMS_ERROR(400, "请求参数错误"),
    UNAUTHORIZED(401, "未登录或token已过期"),
    FORBIDDEN(403, "没有相关权限"),
    NOT_FOUND(404, "请求的资源不存在"),
    SYSTEM_ERROR(500, "系统内部异常"),
    
    // 用户相关错误
    USER_NOT_FOUND(1001, "用户不存在"),
    USERNAME_ALREADY_EXISTS(1002, "用户名已存在"),
    PASSWORD_ERROR(1003, "密码错误"),
    USER_ACCOUNT_LOCKED(1004, "账号已被锁定"),
    
    // 文章相关错误
    ARTICLE_NOT_FOUND(2001, "文章不存在"),
    NO_PERMISSION_TO_UPDATE(2002, "没有权限修改该文章"),
    NO_PERMISSION_TO_DELETE(2003, "没有权限删除该文章"),
    
    // 分类相关错误
    CATEGORY_NOT_FOUND(3001, "分类不存在"),
    CATEGORY_NAME_ALREADY_EXISTS(3002, "分类名称已存在");*/

    // ----------- 通用异常状态码 -----------
    SYSTEM_ERROR("10000", "系统内部异常,后台小哥正在努力修复中..."),
    PARAM_NOT_VALID("10001", "参数错误"),


    USERNAME_OR_PWD_ERROR("20001", "用户名或密码错误"),
    LOGIN_FAIL("20002", "登录失败")
    ;
    // 异常码
    private String errorCode;
    // 错误信息
    private String errorMessage;

} 
package com.jovan.blog.common.aspect;

import java.lang.annotation.*;

/**
 * @author: Jovan
 * @date: 2024/12/8
 * @description:
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface ApiOperationLog {

    String description() default "";
}

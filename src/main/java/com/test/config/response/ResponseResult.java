package com.test.config.response;

import java.lang.annotation.*;


/**
 * 自定义注解@ResponseResult来拦截有此controller注解类的代表需要统一返回json格式，没有就安照原来返回
 * 统一包装接口返回的值 Result
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ResponseResult {
}

package com.example.xnlogin.enums;

/**
 * 状态码的枚举
 */
public enum CodeEnum {
    
    SUCCESS(999, "成功"),
    LOGIN_SUCCESS(666, "登录成功"),
    REGISTER_SUCCESS(888, "注册成功"),
    LOGIN_FAILED(600, "用户不存在，登录失败"),
    REGISTER_FAILED(601, "用户已存在，注册失败"),
    PASSWORD_IS_EMPTY(701,"密码不能为空"),
    PASSWORD_IS_FALSE(702, "密码不正确"),
    FAILED(520, "失败");


    private Integer code;
    private String desc;

    public Integer getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }


    CodeEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}

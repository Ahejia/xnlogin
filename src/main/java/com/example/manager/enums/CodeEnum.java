package com.example.manager.enums;

/**
 * @author hj
 * 状态码的枚举
 */
public enum CodeEnum {
    /**返回的状态以及描述*/
    SUCCESS(999, "成功"),
    LOGIN_SUCCESS(666, "登录成功"),
    REGISTER_SUCCESS(888, "注册成功"),
    LOGIN_FAILED(600, "用户不存在，登录失败"),
    REGISTER_FAILED(601, "用户已存在，注册失败"),
    PASSWORD_IS_EMPTY(701,"密码不能为空"),
    PASSWORD_IS_FALSE(702, "密码不正确"),
    EMAIL_FAILED(801, "验证码失效或验证码不一致，请重新输入"),
    FAILED(555, "失败");

    /**返回的code*/
    private Integer code;
    /**描述*/
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

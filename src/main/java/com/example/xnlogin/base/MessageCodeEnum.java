package com.example.xnlogin.base;

/**
 * 错误消息枚举
 *
 * @author liujunjie
 * @date 2018/5/11
 */
public enum MessageCodeEnum {

    /***/
    TOKEN_EXPIRED("登录状态已过期，请重新登录"),
    TOKEN_ILLEGAL("登录状态错误，请重新登录"),

    SYSTEM_ERROR("系统错误"),
    PARAMETER_IS_NULL("参数为空"),
    PARAMETER_NOT_VALID("参数非法"),
    NO_DATA("数据为空"),
    ERROR_DATA("待发货数不足"),
    DEALER_NOT_EXIST("商户不存在"),
    OPERATE_FAIL("操作失败"),

    WX_LOGIN_FAILED("微信登录失败"),
    USER_GROUP_NOT_DELETE("用户组不能删除"),
    REDIS_VERIF_CODE_NOT_EXSIT("验证码不存在"),
    REDIS_VERIF_CODE_INCORRECT("验证码不正确"),
    USER_EXIST("用户已存在"),
    USER_NOT_EXIST("用户不存在"),
    USER_OR_PSW_IS_ERROR("用户名或密码错误");

    private Integer code;
    private String desc;

    public Integer getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }


    MessageCodeEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    private String message;

    MessageCodeEnum(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

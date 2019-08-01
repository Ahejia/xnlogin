package com.example.xnlogin.base;

/**
 * <P> request请求里面userId的类型 </p>
 *
 * @author dab
 * @version 1.0.0
 * @date 2018/10/9 18:39
 */
public enum UserTypeEnum {

    /**
     * user 的类型
     */
    BICYCLE(1, "车辆用户"),
    SYSTEM(2, "系统用户"),
    DEALER(3, "商户用户"),
    TEST(4,"测试用户");

    /**
     * 用户类型代码
     */
    private Integer typeCode;

    /**
     * 描述接口用途
     */
    private String description;

    UserTypeEnum(Integer typeCode, String description) {
        this.typeCode = typeCode;
        this.description = description;
    }

    public Integer getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(Integer typeCode) {
        this.typeCode = typeCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

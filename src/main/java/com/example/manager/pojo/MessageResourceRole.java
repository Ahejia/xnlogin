package com.example.manager.pojo;

import java.util.Date;

public class MessageResourceRole {
    /**应用id*/
    private String applicationId;
    /**资源id*/
    private String resourceId;
    /**角色id*/
    private String roleId;

    /**是否有效（0启用1禁用）*/
    private Short isEffective;
    /**显示顺序*/
    private Integer orderNum;
    /**创建人id*/
    private String createId;
    /**创建人*/
    private String createName;
    /**创建时间*/
    private Date createTime;
    /**创建人id*/
    private String updateId;
    /**创建人*/
    private String updateName;
    /**修改时间*/
    private Date updateTime;
    /**删除状态（0有效1删除）*/
    private Short delStatus;

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public Short getIsEffective() {
        return isEffective;
    }

    public void setIsEffective(Short isEffective) {
        this.isEffective = isEffective;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public String getCreateId() {
        return createId;
    }

    public void setCreateId(String createId) {
        this.createId = createId;
    }

    public String getCreateName() {
        return createName;
    }

    public void setCreateName(String createName) {
        this.createName = createName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdateId() {
        return updateId;
    }

    public void setUpdateId(String updateId) {
        this.updateId = updateId;
    }

    public String getUpdateName() {
        return updateName;
    }

    public void setUpdateName(String updateName) {
        this.updateName = updateName;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Short getDelStatus() {
        return delStatus;
    }

    public void setDelStatus(Short delStatus) {
        this.delStatus = delStatus;
    }
}
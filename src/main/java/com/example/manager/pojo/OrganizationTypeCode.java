package com.example.manager.pojo;

import com.example.manager.base.BaseEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author: hj
 * @Description: 机构类型
 * @Date:Create：in 2019/10/29 11:31
 */
public class OrganizationTypeCode implements Serializable {
    /**机构类型编号*/
    private String id;
    /**机构类型代码*/
    private String typeNum;
    /**名称*/
    private String name;
    /**是否有效（0启用1禁用）*/
    private Short isEffective;
    /**显示顺序*/
    private Integer orderNum;
    /**创建人id*/
    private String createId;
    /**创建人*/
    private String createName;
    /**创建人*/
    private Date createTime;
    /**修改人id*/
    private String updateId;
    /**修改人*/
    private String updateName;
    /**修改时间*/
    private Date updateTime;
    /**删除状态(0有效1删除)*/
    private Short delStatus;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTypeNum() {
        return typeNum;
    }

    public void setTypeNum(String typeNum) {
        this.typeNum = typeNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

package com.example.manager.pojo;

import com.example.manager.base.BaseEntity;

import java.util.Date;

/**
 * @Author: hj
 * @Description: 顶级机构信息
 * @Date:Create：in 2019/10/29 14:10
 */
public class TopInstitutionsInfo extends BaseEntity {

    /**机构编码*/
    private String code;
    /**机构名字*/
    private String name;
    /**机构地址*/
    private String address;
    /**机构坐标*/
    private String coordinate;
    /**机构联系人*/
    private String contacts;
    /**机构电话*/
    private String phoneNum;
    /**是否有效（0启用1删除）*/
    private Short isEffective;
    /**显示顺序*/
    private Integer orderNum;
    /**创建人id*/
    private String createId;
    /**创建人*/
    private String createName;
    /**创建时间*/
    private Date createTime;
    /**修改人id*/
    private String updateId;
    /**修改人*/
    private String updateName;
    /**修改时间*/
    private Date updateTime;
    /**删除状态(0有效1删除)*/
    private Short delStatus;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(String coordinate) {
        this.coordinate = coordinate;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
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

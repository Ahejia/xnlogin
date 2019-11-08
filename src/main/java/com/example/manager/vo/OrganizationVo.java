package com.example.manager.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * @Author: hj
 * @Description:
 * @Date:Create：in 2019/11/7 9:19
 */
@ApiModel("机构信息")
public class OrganizationVo {
    @ApiModelProperty("机构编号，添加的时候不填")
    private String id;
    /**
     * 机构编码
     */
    @ApiModelProperty("机构编码")
    private String code;
    /**
     * 机构名字
     */
    @ApiModelProperty("机构名字")
    private String name;
    /**
     * 机构全称
     */
    @ApiModelProperty("机构全称")
    private String fullName;
    /**
     * 机构简称
     */
    @ApiModelProperty("机构简称")
    private String easyName;
    /**
     * 机构地址
     */
    @ApiModelProperty("机构地址")
    private String address;
    /**
     * 机构坐标
     */
    @ApiModelProperty("机构坐标")
    private String coordinate;
    /**
     * 机构电话
     */
    @ApiModelProperty("机构电话")
    private String phoneNum;
    /**
     * 机构联系人
     */
    @ApiModelProperty("机构联系人")
    private String contacts;
    /**
     * 是否有效（0启用1禁用）
     */
    @ApiModelProperty("是否有效(0启用1禁用)")
    private Short isEffective;
    /**
     * 机构父id
     */
    @ApiModelProperty("机构父id")
    private String fatherId;
    /**
     * 机构类型编号
     */
    @ApiModelProperty("机构类型编号*")
    private String typeCode;
    /**
     * 描述
     */
    @ApiModelProperty("描述")
    private String description;
    /**
     * 显示顺序
     */
    @ApiModelProperty("显示顺序")
    private Integer orderNum;
    /**
     * 创建人id
     */
    @ApiModelProperty("创建人id*")
    private String createId;
    /**
     * 创建人
     */
    @ApiModelProperty("创建人*")
    private String createName;
    /**
     * 创建时间
     */
    @ApiModelProperty("创建时间")
    private Date createTime;
    /**
     * 修改人id
     */
    @ApiModelProperty("修改人id")
    private String updateId;
    /**
     * 修改人
     */
    @ApiModelProperty("修改人")
    private String updateName;
    /**
     * 修改时间
     */
    @ApiModelProperty("修改时间")
    private Date updateTime;
    /**
     * 删除状态（0有效1删除）
     */
    @ApiModelProperty("删除状态(0有效1删除)")
    private Short delStatus;

    @ApiModelProperty("岗位编号*")
    private String postId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEasyName() {
        return easyName;
    }

    public void setEasyName(String easyName) {
        this.easyName = easyName;
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

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    public Short getIsEffective() {
        return isEffective;
    }

    public void setIsEffective(Short isEffective) {
        this.isEffective = isEffective;
    }

    public String getFatherId() {
        return fatherId;
    }

    public void setFatherId(String fatherId) {
        this.fatherId = fatherId;
    }

    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }
}

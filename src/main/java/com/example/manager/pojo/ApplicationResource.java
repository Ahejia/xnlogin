package com.example.manager.pojo;

import com.example.manager.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * @Author hj
 * @Description 应用资源表
 * @Date 16:31 2019/10/22
 **/
@ApiModel("应用资源")
public class ApplicationResource extends BaseEntity {

    /**
     * 应用id
     */
    @ApiModelProperty("应用编号")
    private String applicationId;
    /**
     * 资源编码
     */
    @ApiModelProperty("资源编号（例如00001）")
    private String code;
    /**
     * 资源名称
     */
    @ApiModelProperty("资源名称")
    private String name;
    /**
     * 资源类型
     */
    @ApiModelProperty("资源类型")
    private String type;
    /**
     * 资源url
     */
    @ApiModelProperty("资源url")
    private String url;
    /**
     * 是否被禁用（0启用1禁用）
     */
    @ApiModelProperty("状态(0启用1禁用)")
    private Short isEffective;
    /**
     * 备注
     */
    @ApiModelProperty("备注")
    private String description;
    /**
     * 父id
     */
    @ApiModelProperty("父id")
    private String fatherId;
    /**
     * 排序
     */
    @ApiModelProperty("排序")
    private Integer orderNum;
    /**
     * 是否开启授权(0未开启1开启授权)
     */
    @ApiModelProperty("是否开启授权（0未开启1开启授权）")
    private Short isOpen;

    /**创建人id*/
    @ApiModelProperty("创建人id")
    private String createId;
    /**创建人*/
    @ApiModelProperty("创建人")
    private String createName;
    /**创建时间*/
    @ApiModelProperty("创建时间")
    private Date createTime;
    /**修改人id*/
    @ApiModelProperty("修改人id")
    private String updateId;
    /**修改人*/
    @ApiModelProperty("修改人")
    private String updateName;
    /**修改时间*/
    @ApiModelProperty("修改时间")
    private Date updateTime;
    /**删除状态（0有效1删除）*/
    @ApiModelProperty("删除状态(0有效1删除)")
    private Short delStatus;


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public Short getIsEffective() {
        return isEffective;
    }

    public void setIsEffective(Short isEffective) {
        this.isEffective = isEffective;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFatherId() {
        return fatherId;
    }

    public void setFatherId(String fatherId) {
        this.fatherId = fatherId;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public Short getIsOpen() {
        return isOpen;
    }

    public void setIsOpen(Short isOpen) {
        this.isOpen = isOpen;
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
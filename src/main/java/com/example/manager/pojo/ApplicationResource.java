package com.example.manager.pojo;

import com.example.manager.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @Author hj
 * @Description 应用资源表
 * @Date 16:31 2019/10/22
 **/
@ApiModel("应用资源")
public class ApplicationResource extends BaseEntity {
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
    private Short status;
    /**
     * 备注
     */
    @ApiModelProperty("备注")
    private String remark;
    /**
     * 父id
     */
    @ApiModelProperty("父id")
    private Long parentId;
    /**
     * 排序
     */
    @ApiModelProperty("排序")
    private Double sort;
    /**
     * 是否开启授权(0未开启1开启授权)
     */
    @ApiModelProperty("是否开启授权（0未开启1开启授权）")
    private Short authorization;
    /**
     * 应用id
     */
    @ApiModelProperty("应用编号")
    private Long applicationId;

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

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Double getSort() {
        return sort;
    }

    public void setSort(Double sort) {
        this.sort = sort;
    }

    public Short getAuthorization() {
        return authorization;
    }

    public void setAuthorization(Short authorization) {
        this.authorization = authorization;
    }

    public Long getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(Long applicationId) {
        this.applicationId = applicationId;
    }
}
package com.example.manager.pojo;

import com.example.manager.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * @Author hj
 * @Description  应用信息表
 * @Date 16:30 2019/10/22
**/
@ApiModel("应用信息")
public class ApplicationMessage extends BaseEntity {
    /**
     * 应用编号（例如00001）
     */
    @ApiModelProperty("应用编号（例如00001）")
    private String serialNumber;
    /**
     * 全称
     */
    @ApiModelProperty("全称")
    private String fullName;
    /**
     * 简称
     */
    @ApiModelProperty("简称")
    private String simpleName;
    /**
     * 版本
     */
    @ApiModelProperty("版本")
    private String version;
    /**
     * 主入口（应该是一个url）
     */
    @ApiModelProperty("主入口")
    private String mainEntry;
    /**
     * 应用来源
     */
    @ApiModelProperty("应用来源")
    private String fromWhere;
    /**
     * 应用图标文件
     */
    @ApiModelProperty("应用图标文件")
    private String applicationIcon;
    /**
     * 是否统一权限配置(0否1是)
     */
    @ApiModelProperty("是否统一权限配置（0否1是）")
    private Short unifyAccess;
    /**
     * 部署时间
     */
    @ApiModelProperty("部署时间")
    private Date deploymentTime;
    /**
     * 最大并发数
     */
    @ApiModelProperty("最大并发数")
    private Integer maxConcurrent;
    /**
     * 是否禁用（0启用1禁用）
     */
    @ApiModelProperty(value = "是否禁用 0启用1禁用")
    private Short status;
    /**
     * 备注
     */
    @ApiModelProperty("备注")
    private String description;
    /**
     * 创建时间
     */
    @ApiModelProperty("创建时间")
    private Date createTime;
    /**
     * 最近更新时间
     */
    @ApiModelProperty("最近更新时间")
    private Date renewTime;
    /**
     * 修改时间
     */
    @ApiModelProperty("修改时间")
    private Date updateTime;
    /**
     * 停止时间
     */
    @ApiModelProperty("停止时间")
    private Date stopTime;
    /**
     * 显示顺序
     */
    @ApiModelProperty("显示顺序")
    private Integer orderNum;
    /**应用管理员id*/
    @ApiModelProperty("应用管理员id")
    private String adminId;
    /**
     * 应用类型
     */
    @ApiModelProperty("应用类型")
    private Short type;
    /**
     * 认证方式
     */
    @ApiModelProperty("认证方式")
    private Short authentication;
    /**
     * 网页启动*方式
     */
    @ApiModelProperty("网页启动方式")
    private String webStartUrl;
    /**
     * 本地启动命令行
     */
    @ApiModelProperty("本地启动命令行")
    private String commandLine;
    /**
     * 注册初始化脚本文件
     */
    @ApiModelProperty("注册初始化脚本文件")
    private String initScript;
    /**
     * 自动填表配置
     */
    @ApiModelProperty("自动填表配置")
    private String autoFile;

    /**创建人id*/
    @ApiModelProperty("创建人id")
    private String createId;
    /**创建人*/
    @ApiModelProperty("创建人")
    private String createName;
    /**修改人id*/
    @ApiModelProperty("修改人id")
    private String updateId;
    /**修改人*/
    @ApiModelProperty("修改人")
    private String updateName;

    /**删除状态(0有效1删除)*/
    @ApiModelProperty("删除状态(0有效1删除)")
    private Short delStatus;

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName == null ? null : fullName.trim();
    }

    public String getSimpleName() {
        return simpleName;
    }

    public void setSimpleName(String simpleName) {
        this.simpleName = simpleName == null ? null : simpleName.trim();
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    public String getMainEntry() {
        return mainEntry;
    }

    public void setMainEntry(String mainEntry) {
        this.mainEntry = mainEntry == null ? null : mainEntry.trim();
    }

    public String getApplicationIcon() {
        return applicationIcon;
    }

    public void setApplicationIcon(String applicationIcon) {
        this.applicationIcon = applicationIcon == null ? null : applicationIcon.trim();
    }

    public Short getUnifyAccess() {
        return unifyAccess;
    }

    public void setUnifyAccess(Short unifyAccess) {
        this.unifyAccess = unifyAccess;
    }

    public Date getDeploymentTime() {
        return deploymentTime;
    }

    public void setDeploymentTime(Date deploymentTime) {
        this.deploymentTime = deploymentTime;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getStopTime() {
        return stopTime;
    }

    public void setStopTime(Date stopTime) {
        this.stopTime = stopTime;
    }

    public Short getType() {
        return type;
    }

    public void setType(Short type) {
        this.type = type;
    }

    public Short getAuthentication() {
        return authentication;
    }

    public void setAuthentication(Short authentication) {
        this.authentication = authentication;
    }

    public String getWebStartUrl() {
        return webStartUrl;
    }

    public void setWebStartUrl(String webStartUrl) {
        this.webStartUrl = webStartUrl == null ? null : webStartUrl.trim();
    }

    public String getCommandLine() {
        return commandLine;
    }

    public void setCommandLine(String commandLine) {
        this.commandLine = commandLine == null ? null : commandLine.trim();
    }

    public String getInitScript() {
        return initScript;
    }

    public void setInitScript(String initScript) {
        this.initScript = initScript == null ? null : initScript.trim();
    }

    public String getFromWhere() {
        return fromWhere;
    }

    public void setFromWhere(String fromWhere) {
        this.fromWhere = fromWhere;
    }

    public Date getRenewTime() {
        return renewTime;
    }

    public void setRenewTime(Date renewTime) {
        this.renewTime = renewTime;
    }

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
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

    public Short getDelStatus() {
        return delStatus;
    }

    public void setDelStatus(Short delStatus) {
        this.delStatus = delStatus;
    }

    public Integer getMaxConcurrent() {
        return maxConcurrent;
    }

    public void setMaxConcurrent(Integer maxConcurrent) {
        this.maxConcurrent = maxConcurrent;
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

    public String getAutoFile() {
        return autoFile;
    }

    public void setAutoFile(String autoFile) {
        this.autoFile = autoFile;
    }
}
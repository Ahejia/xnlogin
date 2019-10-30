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
    private Date deplayTime;
    /**
     * 最大并发数
     */
    @ApiModelProperty("最大并发数")
    private Long allowConcurrency;
    /**
     * 是否禁用（0启用1禁用）
     */
    @ApiModelProperty(value = "是否禁用 0启用1禁用")
    private Short status;
    /**
     * 备注
     */
    @ApiModelProperty("备注")
    private String remark;
    /**
     * 创建时间
     */
    @ApiModelProperty("创建时间")
    private Date createTime;
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
    private Double sort;
    /**
     * 类型
     */
    @ApiModelProperty("类型")
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
    private String autoConfigFile;

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

    public Date getDeplayTime() {
        return deplayTime;
    }

    public void setDeplayTime(Date deplayTime) {
        this.deplayTime = deplayTime;
    }

    public Long getAllowConcurrency() {
        return allowConcurrency;
    }

    public void setAllowConcurrency(Long allowConcurrency) {
        this.allowConcurrency = allowConcurrency;
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

    public Double getSort() {
        return sort;
    }

    public void setSort(Double sort) {
        this.sort = sort;
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

    public String getAutoConfigFile() {
        return autoConfigFile;
    }

    public void setAutoConfigFile(String autoConfigFile) {
        this.autoConfigFile = autoConfigFile == null ? null : autoConfigFile.trim();
    }
}
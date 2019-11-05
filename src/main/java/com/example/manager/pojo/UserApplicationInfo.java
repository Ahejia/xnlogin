package com.example.manager.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * @Description  
 * @Author  Hunter
 * @Date 2019-11-05 
 */
public class UserApplicationInfo implements Serializable {

	private static final long serialVersionUID =  1798955649652269203L;

	/**
	 * 用户id
	 */
	private String userId;

	/**
	 * 应用序号
	 */
	private String indexNum;

	/**
	 * 应用ID
	 */
	private String applicationId;

	/**
	 * 运行程序路径
	 */
	private String route;

	/**
	 * 程序工作目录
	 */
	private String catalog;

	/**
	 * 应用登录账户
	 */
	private String loginAccount;

	/**
	 * 应用登录密码
	 */
	private String loginPwd;

	/**
	 * 网页启动url
	 */
	private String webUrl;

	/**
	 * 本地启动命行
	 */
	private String localCommand;

	/**
	 * 应用类型
	 */
	private String applicationType;

	/**
	 * 认证方式
	 */
	private String authenticationMethod;

	/**
	 * 应用主入口
	 */
	private String applicationMain;

	/**
	 * 自动填表配置文件
	 */
	private String autoFile;

	/**
	 * 创建人ID
	 */
	private String createId;

	/**
	 * 创建人
	 */
	private String createName;

	/**
	 * 创建时间
	 */
	private Date createTime;

	/**
	 * 修改人ID
	 */
	private String updateId;

	/**
	 * 修改人
	 */
	private String updateName;

	/**
	 * 修改时间
	 */
	private Date updateTime;

	/**
	 * 删除状态
	 */
	private Short delStatus;

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getIndexNum() {
		return indexNum;
	}

	public void setIndexNum(String indexNum) {
		this.indexNum = indexNum;
	}

	public String getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}

	public String getRoute() {
		return route;
	}

	public void setRoute(String route) {
		this.route = route;
	}

	public String getCatalog() {
		return catalog;
	}

	public void setCatalog(String catalog) {
		this.catalog = catalog;
	}

	public String getLoginAccount() {
		return loginAccount;
	}

	public void setLoginAccount(String loginAccount) {
		this.loginAccount = loginAccount;
	}

	public String getLoginPwd() {
		return loginPwd;
	}

	public void setLoginPwd(String loginPwd) {
		this.loginPwd = loginPwd;
	}

	public String getWebUrl() {
		return webUrl;
	}

	public void setWebUrl(String webUrl) {
		this.webUrl = webUrl;
	}

	public String getLocalCommand() {
		return localCommand;
	}

	public void setLocalCommand(String localCommand) {
		this.localCommand = localCommand;
	}

	public String getApplicationType() {
		return applicationType;
	}

	public void setApplicationType(String applicationType) {
		this.applicationType = applicationType;
	}

	public String getAuthenticationMethod() {
		return authenticationMethod;
	}

	public void setAuthenticationMethod(String authenticationMethod) {
		this.authenticationMethod = authenticationMethod;
	}

	public String getApplicationMain() {
		return applicationMain;
	}

	public void setApplicationMain(String applicationMain) {
		this.applicationMain = applicationMain;
	}

	public String getAutoFile() {
		return autoFile;
	}

	public void setAutoFile(String autoFile) {
		this.autoFile = autoFile;
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

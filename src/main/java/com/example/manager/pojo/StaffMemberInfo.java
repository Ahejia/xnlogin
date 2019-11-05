package com.example.manager.pojo;

import com.example.manager.base.BaseEntity;

import java.util.Date;

/**
 * @Description  
 * @Author  Hunter
 * @Date 2019-11-05 
 */
public class StaffMemberInfo extends BaseEntity {

	private static final long serialVersionUID =  4487826914054659772L;


	/**
	 * 职员工号
	 */
	private String workNum;

	/**
	 * 职员姓名
	 */
	private String name;

	/**
	 * 证件号码
	 */
	private String idcardNum;

	/**
	 * 出生日期
	 */
	private Date birthday;

	/**
	 * 初次入职日期
	 */
	private Date firstDay;

	/**
	 * 最近入职日期
	 */
	private Date lateDay;

	/**
	 * 通信地址
	 */
	private String address;

	/**
	 * 家庭地址
	 */
	private String homeAddress;

	/**
	 * 性别代号
	 */
	private String sexType;

	/**
	 * 证件类型代号
	 */
	private String idcardType;

	/**
	 * 机构ID
	 */
	private String organizationId;

	/**
	 * 人员主索引
	 */
	private String mainIndex;

	/**
	 * 是否轮值人员
	 */
	private Short isRotation;

	/**
	 * 是否有效
	 */
	private Short isEffective;

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

	public String getWorkNum() {
		return workNum;
	}

	public void setWorkNum(String workNum) {
		this.workNum = workNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIdcardNum() {
		return idcardNum;
	}

	public void setIdcardNum(String idcardNum) {
		this.idcardNum = idcardNum;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Date getFirstDay() {
		return firstDay;
	}

	public void setFirstDay(Date firstDay) {
		this.firstDay = firstDay;
	}

	public Date getLateDay() {
		return lateDay;
	}

	public void setLateDay(Date lateDay) {
		this.lateDay = lateDay;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}

	public String getSexType() {
		return sexType;
	}

	public void setSexType(String sexType) {
		this.sexType = sexType;
	}

	public String getIdcardType() {
		return idcardType;
	}

	public void setIdcardType(String idcardType) {
		this.idcardType = idcardType;
	}

	public String getOrganizationId() {
		return organizationId;
	}

	public void setOrganizationId(String organizationId) {
		this.organizationId = organizationId;
	}

	public String getMainIndex() {
		return mainIndex;
	}

	public void setMainIndex(String mainIndex) {
		this.mainIndex = mainIndex;
	}

	public Short getIsRotation() {
		return isRotation;
	}

	public void setIsRotation(Short isRotation) {
		this.isRotation = isRotation;
	}

	public Short getIsEffective() {
		return isEffective;
	}

	public void setIsEffective(Short isEffective) {
		this.isEffective = isEffective;
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

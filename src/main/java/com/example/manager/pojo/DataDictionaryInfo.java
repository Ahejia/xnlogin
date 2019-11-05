package com.example.manager.pojo;

import com.example.manager.base.BaseEntity;

import java.util.Date;

/**
 * @Description  
 * @Author  Hunter
 * @Date 2019-11-05 
 */
public class DataDictionaryInfo extends BaseEntity {

	/**
	 * 主表id
	 */
	private String typeId;

	/**
	 * 编码
	 */
	private String code;

	/**
	 * 名称
	 */
	private String name;

	/**
	 * 排序
	 */
	private Integer orderNum;

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


	public String getTypeId() {
		return typeId;
	}

	public void setTypeId(String typeId) {
		this.typeId = typeId;
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

	public Integer getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(Integer orderNum) {
		this.orderNum = orderNum;
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

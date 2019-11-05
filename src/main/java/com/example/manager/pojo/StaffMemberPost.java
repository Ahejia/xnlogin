package com.example.manager.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * @Description  
 * @Author  Hunter
 * @Date 2019-11-05 
 */
public class StaffMemberPost implements Serializable {

	private static final long serialVersionUID =  5990612445501793238L;

	/**
	 * 职员id
	 */
	private String staffMemberId;
	/**
	 * 岗位id
	 */
	private String postId;

	/**
	 * 机构id
	 */
	private String organizationId;

	/**
	 * 生效日期
	 */
	private Date startDay;

	/**
	 * 有效期至
	 */
	private Date endDay;

	/**
	 * 显示顺序
	 */
	private Integer orderNum;

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

	public String getStaffMemberId() {
		return staffMemberId;
	}

	public void setStaffMemberId(String staffMemberId) {
		this.staffMemberId = staffMemberId;
	}

	public String getPostId() {
		return postId;
	}

	public void setPostId(String postId) {
		this.postId = postId;
	}

	public String getOrganizationId() {
		return organizationId;
	}

	public void setOrganizationId(String organizationId) {
		this.organizationId = organizationId;
	}

	public Date getStartDay() {
		return startDay;
	}

	public void setStartDay(Date startDay) {
		this.startDay = startDay;
	}

	public Date getEndDay() {
		return endDay;
	}

	public void setEndDay(Date endDay) {
		this.endDay = endDay;
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

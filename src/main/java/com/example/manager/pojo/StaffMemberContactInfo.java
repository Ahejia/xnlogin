package com.example.manager.pojo;
import java.io.Serializable;
import java.util.Date;

/**
 * @Description  
 * @Author  Hunter
 * @Date 2019-11-05 
 */

public class StaffMemberContactInfo implements Serializable {

	private static final long serialVersionUID =  947414308753989539L;

	/**
	 * 职员id
	 */
	private String staffMemberId;

	/**
	 * 序号
	 */
	private String indexNum;

	/**
	 * 联系方式代号
	 */
	private String contactCode;

	/**
	 * 联系方式
	 */
	private String contactMode;

	/**
	 * 说明备注
	 */
	private String description;

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

	public String getIndexNum() {
		return indexNum;
	}

	public void setIndexNum(String indexNum) {
		this.indexNum = indexNum;
	}

	public String getContactCode() {
		return contactCode;
	}

	public void setContactCode(String contactCode) {
		this.contactCode = contactCode;
	}

	public String getContactMode() {
		return contactMode;
	}

	public void setContactMode(String contactMode) {
		this.contactMode = contactMode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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

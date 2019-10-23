package com.example.manager.pojo;

import com.example.manager.base.BaseEntity;

/**
 * @Author hj
 * @Description  应用角色表
 * @Date 16:31 2019/10/22
**/
public class ApplicationRole extends BaseEntity {
    /**应用id*/
    private Long applicationId;
    /**名称*/
    private String name;
    /**备注*/
    private String remark;
    /**0启用1禁用*/
    private Short status;

    public Long getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(Long applicationId) {
        this.applicationId = applicationId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }
}
package com.example.xnlogin.mess;

import com.example.xnlogin.base.BaseEntity;

import java.util.Date;

/**
 * @author Administrator
 */
public class UserGrade extends BaseEntity {
    /**
     * 用户编号
     */
    private Long userId;
    /**
     * 数据信息
     */
    private String datainfo;
    /**
     * 分数
     */
    private Integer score;
    /**
     * 时间
     */
    private String timer;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 修改时间
     */
    private Date updateTime;


    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getDatainfo() {
        return datainfo;
    }

    public void setDatainfo(String datainfo) {
        this.datainfo = datainfo == null ? null : datainfo.trim();
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getTimer() {
        return timer;
    }

    public void setTimer(String timer) {
        this.timer = timer == null ? null : timer.trim();
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
}
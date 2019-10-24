package com.example.manager.vo;

/**
 * @Author: hj
 * @Description: 分页查询
 * @Date:Create：in 2019/10/24 11:10
 */
public class PageQuery {
    /**当前页开始数据行号*/
    private Integer pageMinNum;
    /**当前页结束数据行号*/
    private Integer pageMaxNum;

    public Integer getPageMinNum() {
        return pageMinNum;
    }

    public void setPageMinNum(Integer pageMinNum) {
        this.pageMinNum = pageMinNum;
    }

    public Integer getPageMaxNum() {
        return pageMaxNum;
    }

    public void setPageMaxNum(Integer pageMaxNum) {
        this.pageMaxNum = pageMaxNum;
    }
}

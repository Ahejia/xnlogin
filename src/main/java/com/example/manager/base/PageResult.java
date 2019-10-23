package com.example.manager.base;

import java.io.Serializable;
import java.util.List;

/**
 * 类名称：PageSupport
 * 类描述：分页结果对象
 * @author PC
 */
public class PageResult<T> implements Serializable {
    private static final long serialVersionUID = 1L;

    /** 总条数*/
    private int rowCount;

    /** 总页数*/
    private int pageCount;

    /** 结果集*/
    private List<T> records;

    /** 当前页 */
    private Integer pageNow = 1;

    public Integer getPageNow() {
        return pageNow;
    }

    public void setPageNow(Integer pageNow) {
        this.pageNow = pageNow;
    }

    public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public List<T> getRecords() {
        return records;
    }

    public void setRecords(List<T> records) {
        this.records = records;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

}

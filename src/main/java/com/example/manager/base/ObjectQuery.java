package com.example.manager.base;

import java.io.Serializable;

/**
 * 类名称：QueryObject
 * 类描述：查询对象
 *
 * @author PC
 */
public class ObjectQuery implements Serializable {
    private static final long serialVersionUID = 1L;

    /*** 页面大小*/
    private int pageSize = 10;

    /*** 第几页(当前页)*/
    private int pageNow = 1;

    /*** 开始位置*/
    private int pageOffset;

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageNow() {
        return pageNow;
    }

    public void setPageNow(int pageNow) {
        this.pageNow = pageNow;
    }

    public int getPageOffset() {
        this.pageOffset = (this.pageNow - 1) * this.pageSize;
        return pageOffset;
    }

    public void setPageOffset(int po) {
        this.pageOffset = po;
    }

    @Override
    public String toString() {
        return "ObjectQuery [pageSize=" + pageSize + ", pageNow=" + pageNow + ", pageOffset=" + pageOffset + "]";
    }

}

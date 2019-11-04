package com.example.manager.base;

import java.io.Serializable;

/**
 * @author PC-666
 */
public class BaseEntity implements Serializable {
    protected static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

package com.example.manager.service;

import com.example.manager.base.IBaseService;
import com.example.manager.pojo.ApplicationRole;
import com.example.manager.vo.PageQuery;

import java.util.List;

/**
 * @Author: hj
 * @Description: 应用角色相关
 * @Date:Create：in 2019/10/23 16:12
 */
public interface IApplicationRoleService extends IBaseService<ApplicationRole> {
    /**
     * @Description 禁用
     * @Date 9:30 2019/10/24
     * @Param [id] 角色编号
    **/
    void hiddenById(Long id)throws Exception;

    /**
     * @Description 获取当前的序列号
     * @Date 16:05 2019/10/30
     * @return java.lang.Long
     **/
    Long getNextVal()throws Exception;

    /**
     * @Description
     * @Date 11:22 2019/10/24
     * @param pageSize 当前页
     * @param pageNun 每页展示数量
     **/
    List<ApplicationRole> getPage(Integer pageSize, Integer pageNun) throws Exception;
    /**
     * @Description 获取数量
     * @Date 11:51 2019/10/28
    **/
    Integer getCount()throws Exception;

    /**
     * @Description 删除应用时把角色中的应用id置为0
     * @Date 14:39 2019/10/24
     * @Param [applicationId] 应用编号
     **/
    void updateApplicationId(Long applicationId);

    /**删除关联表*/
    void deleteByRoleId(Long roleId)throws Exception;
}

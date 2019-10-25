package com.example.manager.dao;

import com.example.manager.base.IBaseDao;
import com.example.manager.pojo.ApplicationResource;
import com.example.manager.vo.PageQuery;


import java.util.List;

/**
 * @Author: hj
 * @Description: 应用资源
 * @Date:Create：in 2019/10/22 16:53
 */

public interface ApplicationResourceMapper extends IBaseDao<ApplicationResource> {
    /**
     * @Description 根据编号禁用资源
     * @Date 9:21 2019/10/24
     * @Param [id] 编号
    **/
    void hiddenById(Long id)throws Exception;

    /**
     * 分页查询
     */
    List<ApplicationResource> getPage(PageQuery pageQuery) throws Exception;

    /**
     * @Description 删除应用时把资源中的应用id置为0
     * @Date 14:39 2019/10/24
     * @param applicationId 应用编号
     **/
    void updateApplicationId(Long applicationId)throws Exception;

    /**
     * @Description 删除资源时把资源中的父id置为0
     * @Date 14:39 2019/10/24
     * @param id 资源编号
     **/
    void updateParentId(Long id)throws Exception;

    /**删除关联表*/
    void deleteByResourceId(Long resourceId)throws Exception;
}

package com.example.manager.dao;


import com.example.manager.base.IBaseDao;
import com.example.manager.pojo.ApplicationRole;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: hj
 * @Description: 应用角色
 * @Date:Create：in 2019/10/22 16:54
 */
@Mapper
public interface ApplicationRoleMapper extends IBaseDao<ApplicationRole> {
    /**
     * @Author hj
     * @Description 根据角色禁用
     * @Date 9:28 2019/10/24
     * @Param [id] 角色编号
    **/
    void hiddenById(Long id)throws Exception;

    /**
     * @Description 删除应用时把角色中的应用id置为0
     * @Date 14:39 2019/10/24
     * @param applicationId 应用编号
     **/
    void updateApplicationId(Long applicationId);

    /**删除关联表*/
    void deleteByRoleId(Long roleId)throws Exception;
}

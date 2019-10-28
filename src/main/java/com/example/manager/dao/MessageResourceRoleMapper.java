package com.example.manager.dao;

import com.example.manager.base.IBaseDao;
import com.example.manager.pojo.MessageResourceRole;

import java.util.List;

/**
 * @Author hj
 * @Description 应用角色资源
 * @Date 10:45 2019/10/28
**/
public interface MessageResourceRoleMapper extends IBaseDao<MessageResourceRole> {
    /**
     * @Author hj
     * @Description 应用编号查询数据信息
     * @Date 11:05 2019/10/28
     * @param applicationId 应用编号
     * @return java.util.List<com.example.manager.pojo.MessageResourceRole>
    **/
    List<MessageResourceRole> getByApplicationId(Long applicationId)throws Exception;

}
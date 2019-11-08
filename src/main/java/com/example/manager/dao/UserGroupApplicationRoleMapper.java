package com.example.manager.dao;

import com.example.manager.base.IBaseDao;
import com.example.manager.pojo.UserGroupApplicationRole;

import java.util.List;

public interface UserGroupApplicationRoleMapper extends IBaseDao<UserGroupApplicationRole> {

    /**根据用户组查询信息*/
    List<UserGroupApplicationRole> getByGroupId(String groupId)throws Exception;

}
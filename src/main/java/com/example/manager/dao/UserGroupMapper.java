package com.example.manager.dao;

import com.example.manager.base.IBaseDao;
import com.example.manager.pojo.UserGroup;

import java.util.List;

public interface UserGroupMapper extends IBaseDao<UserGroup> {

    /**用户组查询信息*/
    List<UserGroup> getByGroupId(String groupId)throws Exception;
}
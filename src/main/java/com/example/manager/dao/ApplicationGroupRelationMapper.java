package com.example.manager.dao;

import com.example.manager.base.IBaseDao;
import com.example.manager.pojo.ApplicationGroupRelation;

import java.util.List;

public interface ApplicationGroupRelationMapper extends IBaseDao<ApplicationGroupRelation> {

    /**应用组编号查询数据信息*/
    List<ApplicationGroupRelation> getByGroupId(String groupId)throws Exception;

}
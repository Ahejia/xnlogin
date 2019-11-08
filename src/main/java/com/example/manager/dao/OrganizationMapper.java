package com.example.manager.dao;


import com.example.manager.base.IBaseDao;
import com.example.manager.pojo.Organization;

import java.util.List;

/**
 * @Author: hj
 * @Description: 机构信息
 * @Date:Create：in 2019/11/1 16:06
 * @Modified By：
 */
public interface OrganizationMapper extends IBaseDao<Organization> {

    /**
     * 根据机构类型查询机构信息
     */
    List<Organization> getByTypeCode(String typeCode) throws Exception;


}
package com.example.manager.service;

import com.example.manager.base.IBaseService;
import com.example.manager.pojo.Organization;
import com.example.manager.pojo.OrganizationPost;

import java.util.List;

/**
 * @Author: hj
 * @Description:
 * @Date:Create：in 2019/11/6 11:50
 * @Modified By：
 */
public interface IOrganizationService extends IBaseService<Organization> {
    /**
     * @return java.util.List<com.example.manager.pojo.Organization>
     * @Author hj
     * @Description 根据机构类型查询机构信息
     **/
    List<Organization> getByTypeCode(String typeCode) throws Exception;

    /**
     * 保存岗位数据到机构岗位表中
     */
    void saveOrganizationPost(OrganizationPost organizationPost) throws Exception;
}

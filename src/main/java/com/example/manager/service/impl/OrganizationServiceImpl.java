package com.example.manager.service.impl;

import com.example.manager.base.BaseServiceImpl;
import com.example.manager.dao.OrganizationMapper;
import com.example.manager.dao.OrganizationPostMapper;
import com.example.manager.pojo.Organization;
import com.example.manager.pojo.OrganizationPost;
import com.example.manager.service.IOrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: hj
 * @Description:
 * @Date:Create：in 2019/11/6 11:50
 */
@Service
public class OrganizationServiceImpl extends BaseServiceImpl<Organization> implements IOrganizationService {

    @Autowired
    private OrganizationMapper organizationMapper;
    @Autowired
    private OrganizationPostMapper organizationPostMapper;
    @Override
    public List<Organization> getByTypeCode(String typeCode) throws Exception {
        return organizationMapper.getByTypeCode(typeCode);
    }

    @Override
    public void saveOrganizationPost(OrganizationPost organizationPost) throws Exception {
        organizationPostMapper.insert(organizationPost);
    }
}

package com.example.manager.service.impl;

import com.example.manager.base.BaseServiceImpl;
import com.example.manager.dao.ApplicationResourceMapper;
import com.example.manager.pojo.ApplicationResource;
import com.example.manager.service.IApplicationResourceService;
import com.example.manager.vo.PageQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: hj
 * @Description:
 * @Date:Create：in 2019/10/23 16:11
 */
@Service
public class ApplicationResourceServiceImpl extends BaseServiceImpl<ApplicationResource> implements IApplicationResourceService {

    @Autowired
    private ApplicationResourceMapper resourceMapper;

    @Override
    public void hiddenById(Long id) throws Exception {
        ApplicationResource resource = resourceMapper.getById(id);
        resourceMapper.hiddenById(resource);
    }

    @Override
    public Long getNextVal() throws Exception {
        return resourceMapper.getNextVal();
    }

    @Override
    public List<ApplicationResource> getPage(Integer pageSize, Integer pageNun) throws Exception {
        PageQuery pageQuery = new PageQuery();
        pageQuery.setPageMinNum((pageSize-1) * pageNun);
        pageQuery.setPageMaxNum(pageSize * pageNun);
        return resourceMapper.getPage(pageQuery);
    }

    @Override
    public Integer getCount() throws Exception {
        return resourceMapper.getCount();
    }

    @Override
    public void updateApplicationId(Long applicationId) throws Exception{
        resourceMapper.updateApplicationId(applicationId);
    }

    @Override
    public void updateParentId(Long id) throws Exception {
        resourceMapper.updateParentId(id);
    }

    @Override
    public void deleteByResourceId(Long resourceId) throws Exception {
        resourceMapper.deleteByResourceId(resourceId);
    }
}

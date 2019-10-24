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
        resourceMapper.hiddenById(id);
    }

    @Override
    public List<ApplicationResource> getPage(Integer pageSize, Integer pageNun) throws Exception {
        PageQuery pageQuery = new PageQuery();
        pageQuery.setPageMinNum((pageSize-1) * pageNun);
        pageQuery.setPageMaxNum(pageSize * pageNun);
        return resourceMapper.getPage(pageQuery);
    }
}

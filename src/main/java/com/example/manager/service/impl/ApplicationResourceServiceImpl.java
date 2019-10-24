package com.example.manager.service.impl;

import com.example.manager.base.BaseServiceImpl;
import com.example.manager.dao.ApplicationResourceMapper;
import com.example.manager.pojo.ApplicationResource;
import com.example.manager.service.IApplicationResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}

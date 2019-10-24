package com.example.manager.service.impl;

import com.example.manager.base.BaseServiceImpl;
import com.example.manager.dao.ApplicationRoleMapper;
import com.example.manager.pojo.ApplicationRole;
import com.example.manager.service.IApplicationRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: hj
 * @Description:
 * @Date:Create：in 2019/10/23 16:12
 */
@Service
public class ApplicationRoleServiceImpl extends BaseServiceImpl<ApplicationRole> implements IApplicationRoleService {

    @Autowired
    private ApplicationRoleMapper roleMapper;

    @Override
    public void hiddenById(Long id) throws Exception {
        roleMapper.hiddenById(id);
    }

    @Override
    public void updateApplicationId(Long applicationId) {
        roleMapper.updateApplicationId(applicationId);
    }

    @Override
    public void deleteByRoleId(Long roleId) throws Exception {
        roleMapper.deleteByRoleId(roleId);
    }
}

package com.example.manager.service.impl;

import com.example.manager.base.BaseServiceImpl;
import com.example.manager.dao.MessageResourceRoleMapper;
import com.example.manager.pojo.MessageResourceRole;
import com.example.manager.service.IMessageResourceRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: hj
 * @Description:
 * @Date:Create：in 2019/10/28 10:52
 */
@Service
public class MessageResourceRoleServiceImpl extends BaseServiceImpl<MessageResourceRole> implements IMessageResourceRoleService {

    @Autowired
    private MessageResourceRoleMapper messageResourceRoleMapper;
    @Override
    public List<MessageResourceRole> getByApplicationId(Long applicationId) throws Exception {
        return messageResourceRoleMapper.getByApplicationId(applicationId);
    }
}

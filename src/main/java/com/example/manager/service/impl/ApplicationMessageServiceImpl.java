package com.example.manager.service.impl;

import com.example.manager.base.BaseServiceImpl;
import com.example.manager.dao.ApplicationMessageMapper;
import com.example.manager.pojo.ApplicationMessage;
import com.example.manager.service.IApplicationMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: hj
 * @Description:
 * @Date:Create：in 2019/10/23 16:00
 */
@Service
public class ApplicationMessageServiceImpl extends BaseServiceImpl<ApplicationMessage> implements IApplicationMessageService {

    @Autowired
    private ApplicationMessageMapper messageMapper;

    @Override
    public void hiddenById(Long id) throws Exception {
        messageMapper.hiddenById(id);
    }
}

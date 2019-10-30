package com.example.manager.service.impl;

import com.example.manager.base.BaseServiceImpl;
import com.example.manager.dao.ApplicationMessageMapper;
import com.example.manager.pojo.ApplicationMessage;
import com.example.manager.service.IApplicationMessageService;
import com.example.manager.vo.PageQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
        ApplicationMessage message = messageMapper.getById(id);
        messageMapper.hiddenById(message);
    }

    @Override
    public Long getNextVal() throws Exception {
        return messageMapper.getNextVal();
    }

    @Override
    public List<ApplicationMessage> getPage(Integer pageSize, Integer pageNun) throws Exception {
        PageQuery pageQuery = new PageQuery();
        pageQuery.setPageMinNum((pageSize-1) * pageNun);
        pageQuery.setPageMaxNum(pageSize * pageNun);
        return messageMapper.getPage(pageQuery);
    }

    @Override
    public Integer getCount() throws Exception {
        return messageMapper.getCount();
    }

    @Override
    public List<ApplicationMessage> getAllMessageName() throws Exception {
        return messageMapper.getAllMessageName();
    }

    @Override
    public void deleteByApplicationId(Long applicationId) throws Exception {
        messageMapper.deleteByApplicationId(applicationId);
    }
}

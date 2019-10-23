package com.example.manager.dao;

import com.example.manager.base.IBaseDao;
import com.example.manager.pojo.ApplicationMessage;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: hj
 * @Description: 应用信息
 * @Date:Create：in 2019/10/22 16:52
 */
@Mapper
public interface ApplicationMessageMapper extends IBaseDao<ApplicationMessage> {
    /**
     * @Author hj
     * @Description 禁用信息
    **/
    void hiddenById(Long id)throws Exception;
}

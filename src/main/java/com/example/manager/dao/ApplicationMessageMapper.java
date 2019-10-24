package com.example.manager.dao;

import com.example.manager.base.IBaseDao;
import com.example.manager.pojo.ApplicationMessage;
import com.example.manager.vo.PageQuery;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: hj
 * @Description: 应用信息
 * @Date:Create：in 2019/10/22 16:52
 */
@Mapper
public interface ApplicationMessageMapper extends IBaseDao<ApplicationMessage> {
    /**
     * @Description 禁用信息
     **/
    void hiddenById(Long id) throws Exception;

    /**
     * 分页查询
     */
    List<ApplicationMessage> getPage(PageQuery pageQuery) throws Exception;

    /**删除关联表中数据*/
    void deleteByApplicationId(Long applicationId)throws Exception;
}

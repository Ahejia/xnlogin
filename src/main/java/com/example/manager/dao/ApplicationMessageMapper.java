package com.example.manager.dao;

import com.example.manager.base.IBaseDao;
import com.example.manager.pojo.ApplicationMessage;
import com.example.manager.vo.PageQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: hj
 * @Description: 应用信息
 * @Date:Create：in 2019/10/22 16:52
 */

public interface ApplicationMessageMapper extends IBaseDao<ApplicationMessage> {
    /**
     * @Description 禁用/启用信息
     **/
    void hiddenById(ApplicationMessage applicationMessage) throws Exception;

    /**
     * @return java.lang.Long
     * @Description 获取当前的序列号
     * @Date 16:08 2019/10/30
     **/
    Long getNextVal() throws Exception;

    /**
     * 分页查询
     */
    List<ApplicationMessage> getPage(PageQuery pageQuery) throws Exception;

    /**
     * @return java.lang.Integer
     * @Description 查询总的数量
     **/
    Integer getCount() throws Exception;

    /**
     * @return java.util.List<com.example.manager.pojo.ApplicationMessage>
     * @Description 获取所有应用的名称与编号
     * @Date 10:11 2019/10/29
     **/
    List<ApplicationMessage> getAllMessageName() throws Exception;

    /**
     * 删除关联表中数据
     */
    void deleteByApplicationId(Long applicationId) throws Exception;

    /**
     * 查询单个应用
     */
    List<ApplicationMessage> getStrById(String applicationId) throws Exception;
}

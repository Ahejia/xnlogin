package com.example.manager.service;

import com.example.manager.base.IBaseService;
import com.example.manager.pojo.ApplicationMessage;
import com.example.manager.vo.PageQuery;

import java.util.List;

/**
 * @Author: hj
 * @Description:
 * @Date:Create：in 2019/10/23 15:59
 */
public interface IApplicationMessageService extends IBaseService<ApplicationMessage> {
    /**
     * @param id 编号
     * @Description 禁用、启用
     * @Date 17:19 2019/10/23
     **/
    void hiddenById(Long id) throws Exception;

    /**
     * @return java.lang.Long
     * @Description 获取当前的序列号
     * @Date 16:05 2019/10/30
     **/
    String getNextVal() throws Exception;

    /**
     * @param pageSize 当前页
     * @param pageNun  每页展示数量
     * @Description
     * @Date 11:22 2019/10/24
     **/
    List<ApplicationMessage> getPage(Integer pageSize, Integer pageNun) throws Exception;

    /**
     * @return java.lang.Integer
     * @Description 总的数量
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

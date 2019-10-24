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
     * @Description 禁用
     * @Date 17:19 2019/10/23
     * @Param [id] 应用id
    **/
    void hiddenById(Long id)throws Exception;
    /**
     * @Description
     * @Date 11:22 2019/10/24
     * @param pageSize 当前页
     * @param pageNun 每页展示数量
    **/
    List<ApplicationMessage> getPage(Integer pageSize,Integer pageNun)throws Exception;
}

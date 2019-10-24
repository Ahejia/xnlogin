package com.example.manager.service;

import com.example.manager.base.IBaseService;
import com.example.manager.pojo.ApplicationResource;

import java.util.List;

/**
 * @Author: hj
 * @Description:
 * @Date:Create：in 2019/10/23 16:10
 * @Modified By：
 */
public interface IApplicationResourceService extends IBaseService<ApplicationResource> {
    /**
     * @Description 禁用资源
     * @Date 9:19 2019/10/24
     * @Param [id] 资源编号
    **/
    void hiddenById(Long id)throws Exception;

    /**
     * @Description
     * @Date 11:22 2019/10/24
     * @param pageSize 当前页
     * @param pageNun 每页展示数量
     **/
    List<ApplicationResource> getPage(Integer pageSize, Integer pageNun)throws Exception;
}

package com.example.manager.service;

import com.example.manager.base.IBaseService;
import com.example.manager.pojo.ApplicationResource;

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
}

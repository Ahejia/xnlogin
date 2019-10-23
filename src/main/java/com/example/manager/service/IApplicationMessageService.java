package com.example.manager.service;

import com.example.manager.base.IBaseService;
import com.example.manager.pojo.ApplicationMessage;

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
}

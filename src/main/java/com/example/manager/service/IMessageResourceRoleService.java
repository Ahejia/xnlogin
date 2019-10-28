package com.example.manager.service;

import com.example.manager.base.IBaseService;
import com.example.manager.pojo.MessageResourceRole;

import java.util.List;

/**
 * @Author: hj
 * @Description:
 * @Date:Create：in 2019/10/28 10:51
 * @Modified By：
 */
public interface IMessageResourceRoleService extends IBaseService<MessageResourceRole> {
    /**
     * @Author hj
     * @Description 应用编号查询关联信息
     * @Date 11:02 2019/10/28
     * @param applicationId 应用编号
     * @return java.util.List<com.example.manager.pojo.MessageResourceRole>
    **/
    List<MessageResourceRole> getByApplicationId(Long applicationId)throws Exception;
}

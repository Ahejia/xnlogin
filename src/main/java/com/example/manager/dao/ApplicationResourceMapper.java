package com.example.manager.dao;

import com.example.manager.base.IBaseDao;
import com.example.manager.pojo.ApplicationResource;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: hj
 * @Description: 应用资源
 * @Date:Create：in 2019/10/22 16:53
 */
@Mapper
public interface ApplicationResourceMapper extends IBaseDao<ApplicationResource> {
    /**
     * @Description 根据编号禁用资源
     * @Date 9:21 2019/10/24
     * @Param [id] 编号
    **/
    void hiddenById(Long id)throws Exception;
}

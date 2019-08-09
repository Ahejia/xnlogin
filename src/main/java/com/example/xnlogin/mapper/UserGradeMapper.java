package com.example.xnlogin.mapper;

import com.example.xnlogin.base.IBaseDao;
import com.example.xnlogin.mess.UserGrade;

import java.util.List;

public interface UserGradeMapper extends IBaseDao<UserGrade> {

    /**
     * 用户编号查询数据
     */
    List<UserGrade> getByUserId(Integer userId);

    /**
     * 查询某个用户对应的数据量
     */
    Integer getCount(Integer userId);

    /**
     * 查询不同的用户的编号
     * 定时任务
     */
    List<Long> getUsers();

}
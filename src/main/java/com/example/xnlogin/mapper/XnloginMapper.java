package com.example.xnlogin.mapper;

import com.example.xnlogin.base.IBaseDao;
import com.example.xnlogin.mess.Xnlogin;
import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface XnloginMapper extends IBaseDao<Xnlogin> {


    /**
     * 用户名查询信息
     */
    Xnlogin getByUserName(String userName);

    /**
     * 用户名查询信息
     */
    Xnlogin getByEmail(String emailAddress);

    /**
     * 用户名查询信息
     */
    Xnlogin getByAccount(String account);
}
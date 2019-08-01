package com.example.xnlogin.mapper;

import com.example.xnlogin.base.IBaseDao;
import com.example.xnlogin.mess.Xnlogin;
import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface XnloginMapper extends IBaseDao<Xnlogin> {


    /**
     * 用户名查询信息
     * @param userName 用户名
     * @return Xnlogin
     */
    Xnlogin getByUserName(String userName);

    /**
     * 用户名查询信息
     * @param emailAddress 邮箱
     * @return Xnlogin
     */
    Xnlogin getByEmail(String emailAddress);
}
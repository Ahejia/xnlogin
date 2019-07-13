package com.example.xnlogin.mapper;

import com.example.xnlogin.mess.Xnlogin;
import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface XnloginMapper {
    void deleteById(Integer id);

    void insert(Xnlogin record);

    Xnlogin getById(Integer id);

    void update(Xnlogin record);

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
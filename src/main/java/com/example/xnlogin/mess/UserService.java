package com.example.xnlogin.mess;

import com.example.xnlogin.mapper.XnloginMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private XnloginMapper xnloginMapper;

    public Xnlogin getByUserName(String userName){
        return xnloginMapper.getByUserName(userName);
    }

    public Xnlogin getByEmail(String emailAddress){
        return xnloginMapper.getByEmail(emailAddress);
    }

    public void insert(Xnlogin xnlogin)throws Exception{
        xnloginMapper.insert(xnlogin);
    }
}

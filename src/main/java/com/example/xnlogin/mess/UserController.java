package com.example.xnlogin.mess;

import com.example.xnlogin.base.CommonResult;
import com.example.xnlogin.base.MessageCodeEnum;
import com.example.xnlogin.enums.CodeEnum;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/register")
    public CommonResult register(@RequestParam(value = "userName",required = false) String userName,
                                 @RequestParam(value = "emailAddress",required = false)String emailAddress,
                                 @RequestParam(value = "account",required = false)String account,
                                 @RequestParam(value = "password",required = false)String password,
                                 @RequestParam(value = "unit",required = false)String unit,
                                 @RequestParam(value = "identity",required = false)Integer identity){
        if(null == password){
            return CommonResult.fail().setMsg(CodeEnum.PASSWORD_IS_EMPTY.getDesc()).code(CodeEnum.PASSWORD_IS_EMPTY.getCode());
        }
        if(StringUtils.isNotEmpty(userName)){
            Xnlogin xnlogin = userService.getByUserName(userName);
            if(xnlogin != null){
                //用户存在，直接返回
                return CommonResult.fail().setMsg(CodeEnum.REGISTER_FAILED.getDesc()).code(CodeEnum.REGISTER_FAILED.getCode());
            }
        }
        if(StringUtils.isNotEmpty(emailAddress)){
            Xnlogin xnlogin = userService.getByEmail(emailAddress);
            if(xnlogin != null){
                //用户存在，直接返回
                return CommonResult.fail().setMsg(CodeEnum.REGISTER_FAILED.getDesc()).code(CodeEnum.REGISTER_FAILED.getCode());
            }
        }
        if(StringUtils.isNotEmpty(account)){
            Xnlogin xnlogin = userService.getByAccount(account);
            if(xnlogin != null){
                //用户存在，直接返回
                return CommonResult.fail().setMsg(CodeEnum.REGISTER_FAILED.getDesc()).code(CodeEnum.REGISTER_FAILED.getCode());
            }
        }
        //注册
        Xnlogin xnlogin = new Xnlogin();
        xnlogin.setAccount(account);
        xnlogin.setEmailAddress(emailAddress);
        xnlogin.setIdentity(identity);
        xnlogin.setUnit(unit);
        xnlogin.setPassword(password);
        xnlogin.setUserName(userName);
        userService.insert(xnlogin);
        return CommonResult.success().code(CodeEnum.REGISTER_SUCCESS.getCode()).setMsg(CodeEnum.REGISTER_SUCCESS.getDesc());
    }
}

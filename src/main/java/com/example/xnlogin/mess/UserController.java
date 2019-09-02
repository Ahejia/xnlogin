package com.example.xnlogin.mess;

import com.example.xnlogin.base.BaseController;
import com.example.xnlogin.base.CommonResult;
import com.example.xnlogin.email.EmailVerify;
import com.example.xnlogin.enums.CodeEnum;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import static com.example.xnlogin.email.EmailUtil.sendEmail;

@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserController extends BaseController {

    private Logger logger = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private UserService userService;
    /**
     * @describe 注册
     * @param userName 用户名
     * @param emailAddress  邮箱
     * @param password 密码
     * @param identity 身份
     * @param unit 学号
     * @param code 邮箱验证码
     * @return com.example.xnlogin.base.CommonResult
     */
    @RequestMapping("/register")
    public CommonResult register(@RequestParam(value = "userName",required = false) String userName,
                                 @RequestParam(value = "emailAddress",required = false)String emailAddress,
                                 @RequestParam(value = "password",required = false)String password,
                                 @RequestParam(value = "identity",required = false)Integer identity,
                                 @RequestParam(value = "unit",required = false)String unit,
                                 @RequestParam(value = "code",required = false)String code,
                                 HttpSession session)throws Exception{
        if(null == password){
            return CommonResult.fail().setMsg(CodeEnum.PASSWORD_IS_EMPTY.getDesc()).code(CodeEnum.PASSWORD_IS_EMPTY.getCode());
        }
        if(!EmailVerify.isEmail(emailAddress)){
            return CommonResult.fail().setMsg("邮箱不正确");
        }
        if(StringUtils.isEmpty(code)){
            return CommonResult.fail().setMsg("验证码不正确");
        }
        if(StringUtils.isEmpty(userName)  || StringUtils.isEmpty(emailAddress)){
            return CommonResult.fail().setMsg("用户名，邮箱未填写完整，请重新填写");
        }

        if(StringUtils.isNotEmpty(emailAddress)){
            Xnlogin xnlogin = userService.getByEmail(emailAddress);
            if(xnlogin != null){
                //用户存在，直接返回
                return CommonResult.fail().setMsg(CodeEnum.REGISTER_FAILED.getDesc()).code(CodeEnum.REGISTER_FAILED.getCode());
            }
        }
        logger.info("---用户不存在，可以注册并验证邮箱---");
        String emailCode = (String) session.getAttribute("code");
        if(emailCode != null){
            if(emailCode.equals(code)){
                //邮箱对比一致
                //注册
                Xnlogin xnlogin = new Xnlogin();
                xnlogin.setEmailAddress(emailAddress);
                xnlogin.setUnit(unit);
                xnlogin.setIdentity(identity);
                xnlogin.setPassword(password);
                xnlogin.setUserName(userName);
                userService.insert(xnlogin);
                return CommonResult.success().code(CodeEnum.REGISTER_SUCCESS.getCode()).setMsg(CodeEnum.REGISTER_SUCCESS.getDesc());
            }
        }

        return CommonResult.fail().code(CodeEnum.EMAIL_FAILED.getCode()).setMsg(CodeEnum.EMAIL_FAILED.getDesc());
    }
    @RequestMapping("/login")
    public CommonResult login(@RequestParam(value = "hjAccount",required = false) String hjAccount,
                              @RequestParam(value = "password",required = false)String password)throws Exception{
        if(null == password){
            return CommonResult.fail().setMsg(CodeEnum.PASSWORD_IS_EMPTY.getDesc()).code(CodeEnum.PASSWORD_IS_EMPTY.getCode());
        }
        //账号对应其中一个就行
        if(StringUtils.isNotEmpty(hjAccount)){
            //对比用户名,邮箱，账号是否存在数据
            Xnlogin xnlogin1 = userService.getByUserName(hjAccount);
            if(xnlogin1 != null){
                if(xnlogin1.getPassword().equals(password)){
                    return CommonResult.success().code(CodeEnum.LOGIN_SUCCESS.getCode()).setMsg(CodeEnum.LOGIN_SUCCESS.getDesc()).addResult("xnlogin",xnlogin1);
                }else{
                    return CommonResult.fail().code(CodeEnum.PASSWORD_IS_FALSE.getCode()).setMsg(CodeEnum.PASSWORD_IS_FALSE.getDesc());
                }
            }

            Xnlogin xnlogin3 = userService.getByEmail(hjAccount);
            if(xnlogin3 != null){
                if(xnlogin3.getPassword().equals(password)){
                    return CommonResult.success().code(CodeEnum.LOGIN_SUCCESS.getCode()).setMsg(CodeEnum.LOGIN_SUCCESS.getDesc()).addResult("xnlogin",xnlogin3);
                }else{
                    return CommonResult.fail().code(CodeEnum.PASSWORD_IS_FALSE.getCode()).setMsg(CodeEnum.PASSWORD_IS_FALSE.getDesc());
                }
            }
            return CommonResult.fail().setMsg("不存在此账号，请重新输入").code(CodeEnum.LOGIN_FAILED.getCode());
        }
        return CommonResult.fail().setMsg("用户名/邮箱/账号不能为空").code(CodeEnum.FAILED.getCode());
    }

    /**发送验证码*/
    @RequestMapping("/sendCode")
    public CommonResult sendCode(String email, HttpServletRequest request)throws Exception{
        if(!EmailVerify.isEmail(email)){
            return CommonResult.fail().setMsg("邮箱不正确");
        }
        sendEmail(email, request);

        return CommonResult.success();
    }
}

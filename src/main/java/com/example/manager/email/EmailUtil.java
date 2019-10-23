package com.example.manager.email;

/**
 * @author hejia
 * @Classname EmailUtil
 * @Date 2019/9/2 0002 13:44
 */
import java.util.*;

import org.apache.commons.mail.SimpleEmail;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class EmailUtil {
    /** 随机验证码*/
    public static String achieveCode() {  //由于数字1 和0 和字母 O,l 有时分不清，所有，没有字母1 、0
        String[] beforeShuffle= new String[] { "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F",
                "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "a",
                "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v",
                "w", "x", "y", "z" };
        List list = Arrays.asList(beforeShuffle);//将数组转换为集合
        Collections.shuffle(list);  //打乱集合顺序
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i)); //将集合转化为字符串
        }
        return sb.toString().substring(3, 8);  //截取字符串第4到8
    }


    public static void sendAuthCodeEmail(String email, String authCode) throws Exception{
        SimpleEmail mail = new SimpleEmail();
        mail.setHostName("SMTP.qq.com");//发送邮件的服务器
        mail.setAuthentication("951179195", "oewpabhbgcusbfah");//登录邮箱的密码，是开启SMTP的密码
        mail.setFrom("951179195@qq.com","hejia");  //发送邮件的邮箱和发件人
        mail.setSSLOnConnect(true); //使用安全链接
        mail.addTo(email);//接收的邮箱
        mail.setSubject("注册验证码");//设置邮件的主题
        mail.setMsg("尊敬的用户:你好! 注册验证码为:" + authCode+"(有效期为5分钟)");//设置邮件的内容
        mail.send();//发送
    }

    public static void sendEmail(String email,HttpServletRequest request)throws Exception{

        String code = achieveCode();  //生成随机密码

        sendAuthCodeEmail(email, code);
        HttpSession session = request.getSession();
        session.setAttribute("code", code);
        session.setMaxInactiveInterval(300); //设置session有效期 300秒



    }
}

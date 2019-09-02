package com.example.xnlogin.email;

/**
 * @author hejia
 * @Classname EmailVerify
 * @Date 2019/9/2 0002 15:25
 */
/**
 * 测试邮箱地址是否合规
 * @author ukyor
 *
 */
public class EmailVerify {

    public static Boolean  isEmail(String email){
        //定义要匹配的Email地址的正则表达式
        //其中\w代表可用作标识符的字符,不包括$. \w+表示多个
        //  \\.\\w表示点.后面有\w 括号{2,3}代表这个\w有2至3个
        //牵扯到有些邮箱类似com.cn结尾 所以(\\.\\w{2,3})*后面表示可能有另一个2至3位的域名结尾
        //*表示重复0次或更多次
        String regex = "\\w+@\\w+(\\.\\w{2,3})*\\.\\w{2,3}";
        Boolean b = false;
        //如果其中邮箱元素复合正则表达式 regex 则:
        if(email.matches(regex)){
            //输出该邮箱元素 为合规
            b = true;
        }
        return b;
    }

}

package com.example.manager.base;
import org.apache.log4j.Logger;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * @author pc
 */
public class BaseController {

    private Logger logger = Logger.getLogger(this.getClass());

    /**
     * 获取已登录用户 类型
     *
     * @return Integer UserType
     */
    protected Integer getLoginUserType() {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        String token = request.getHeader("token");
        try {
            if (JwtTokenUtils.verifyToken(token).getClaim(RequestConstant.REQUEST_USER_TYPE) != null) {
                return JwtTokenUtils.verifyToken(token).getClaim(RequestConstant.REQUEST_USER_TYPE).asInt();
            }
        } catch (Exception e) {
            logger.error("获取已登录用户 类型 信息失败:" + e.getMessage());
        }
        return null;
    }

    /**
     * 获取已登录用户userId
     *
     * @return Long UserId
     */
    protected Long getLoginUserId() {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        String token = request.getHeader("token");
        try {
            if (JwtTokenUtils.verifyToken(token).getClaim(RequestConstant.REQUEST_USER_ID) != null) {
                return JwtTokenUtils.verifyToken(token).getClaim(RequestConstant.REQUEST_USER_ID).asLong();
            }
        } catch (Exception e) {
            logger.error("获取已登录用户 UserId 信息失败:" + e.getMessage());
        }
        return null;
    }

    /**
     * 获取已登录用户version
     *
     * @return String version
     */
    protected String getLoginUserVersion() {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        String token = request.getHeader("token");
        try {
            if (JwtTokenUtils.verifyToken(token).getClaim(RequestConstant.REQUEST_VERSION) != null) {
                return JwtTokenUtils.verifyToken(token).getClaim(RequestConstant.REQUEST_VERSION).asString();
            }
        } catch (UnsupportedEncodingException e) {
            logger.error("获取已登录用户 version 信息失败:" + e.getMessage());
        }
        return null;
    }

    /**
     * 获取客户端IP地址
     *
     * @return String ip
     */
    protected String getRemoteHostIp() throws IOException {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        return TCPIPUtils.getIpAddress(request);
    }

}

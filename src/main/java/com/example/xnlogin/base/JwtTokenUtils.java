package com.example.xnlogin.base;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import java.io.UnsupportedEncodingException;
import java.util.Date;

/**
 * @author liujunjie
 */
public class JwtTokenUtils {

    /**
     * 加密密钥
     */
    private static final String SECRET = "tracker.pc.bike.token.secret";

    /**
     * 过期时间
     */
    private static final Long EXPIRES = 1000 * 60 * 60 * 24 * 30L;

    /**
     * token生产方
     */
    private static final String ISSUER = "www.tracker";

    /**
     * token接收方
     */
    private static final String AUDIENCE = "app and web";

    /**
     * token 面向的用户
     */
    private static final String SUBJECT = "pc_bike_app_user";


    public static String createToken(UserTypeEnum userTypeEnum, Long userId, String version) {
        Date date = new Date();
        Algorithm algorithm = null;
        try {
            algorithm = Algorithm.HMAC256(SECRET);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        assert algorithm != null;
        return JWT.create()
                .withIssuer(ISSUER)
                //在什么日期之前无效
                .withNotBefore(date)
                //办法jwt的日期
                .withIssuedAt(date)
                //接收该jwt的一方
                .withAudience(AUDIENCE)
                //设置到期的日期
                .withExpiresAt(new Date(date.getTime() + EXPIRES))
                //该JWT所面向的用户，是否使用是可选的
                .withSubject(SUBJECT)
                //自定义属性userid
                .withClaim(RequestConstant.REQUEST_USER_TYPE, userTypeEnum.getTypeCode())
                //自定义属性userid
                .withClaim(RequestConstant.REQUEST_USER_ID, userId)
                //自定义属性version
                .withClaim(RequestConstant.REQUEST_VERSION, version)
                //签名的算法
                .sign(algorithm);
    }


    public static DecodedJWT verifyToken(String token) throws UnsupportedEncodingException {
        Algorithm algorithm = Algorithm.HMAC256(SECRET);
        JWTVerifier verifier = JWT.require(algorithm)
                //保持和生成token的iss一致
                .withIssuer(ISSUER)
                .build(); //Reusable verifier instance
        return verifier.verify(token);

    }
}

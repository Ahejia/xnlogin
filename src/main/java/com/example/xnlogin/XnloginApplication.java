package com.example.xnlogin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
/**
 * @author Administrator
 * @return
 */
@ServletComponentScan
@SpringBootApplication
@MapperScan("com.example.xnlogin.mapper")
public class XnloginApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(XnloginApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(XnloginApplication.class, args);
    }

}

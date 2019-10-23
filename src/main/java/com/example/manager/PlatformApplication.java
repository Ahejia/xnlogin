package com.example.manager;

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
@MapperScan("com.example.xnlogin.dao")
public class PlatformApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(PlatformApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(PlatformApplication.class, args);
    }

}

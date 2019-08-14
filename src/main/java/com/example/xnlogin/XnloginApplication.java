package com.example.xnlogin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.xnlogin.mapper")
public class XnloginApplication {

    public static void main(String[] args) {
        SpringApplication.run(XnloginApplication.class, args);
    }

}

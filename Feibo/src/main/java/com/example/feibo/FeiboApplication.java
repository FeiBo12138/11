package com.example.feibo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.feibo.mapper")
public class FeiboApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeiboApplication.class, args);
    }

}

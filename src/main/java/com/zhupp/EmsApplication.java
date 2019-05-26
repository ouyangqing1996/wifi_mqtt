package com.zhupp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@Import(SwaggerConfig.class)
@SpringBootApplication
@MapperScan("com.zhupp.ems.dao")
public class EmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmsApplication.class, args);
    }

}

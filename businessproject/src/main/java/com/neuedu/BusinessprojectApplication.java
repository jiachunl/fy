package com.neuedu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.neuedu.dao")
public class BusinessprojectApplication {

    public static void main(String[] args) {
        SpringApplication.run(BusinessprojectApplication.class, args);
    }

}

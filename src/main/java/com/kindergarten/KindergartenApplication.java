package com.kindergarten;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.kindergarten.mapper")
public class KindergartenApplication {

    public static void main(String[] args) {
        SpringApplication.run(KindergartenApplication.class, args);
    }

}

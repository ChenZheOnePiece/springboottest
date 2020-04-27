package com.example.redistest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class RedistestApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedistestApplication.class, args);
    }

}

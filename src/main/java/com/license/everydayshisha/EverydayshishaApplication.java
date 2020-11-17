package com.license.everydayshisha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
//@Configuration
//@EnableAutoConfiguration
//@ComponentScan
public class EverydayshishaApplication {

    public static void main(String[] args) {
        SpringApplication.run(EverydayshishaApplication.class, args);
        System.out.println("!!! APPLICATION STARTED !!!");
    }
}

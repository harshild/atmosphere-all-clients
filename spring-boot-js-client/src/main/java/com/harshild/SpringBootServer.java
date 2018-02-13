package com.harshild;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@SpringBootConfiguration
@EnableAutoConfiguration
public class SpringBootServer {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootServer.class,args);
    }
}

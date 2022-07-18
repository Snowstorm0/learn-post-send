package com.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * 启动类
 *
 * @author 代码的路
 * @date 2022/5/15
 */

@SpringBootApplication
public class PostSendApplication {

    public static void main(String[] args) {
        SpringApplication.run(PostSendApplication.class, args);
    }

//    @Bean
//    public RestTemplate restTemplate(){
//        return new RestTemplate();
//    }
}


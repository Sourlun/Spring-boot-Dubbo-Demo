package com.sour.mall;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 *
 * @author xgl
 * @date 2020/8/30 17:25
 **/
@EnableDubbo//开启dubbo注解的形式
@SpringBootApplication
public class UserServiceConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserServiceConsumerApplication.class, args);
    }

}

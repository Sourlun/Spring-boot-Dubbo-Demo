package com.sour.mall;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 *
 * @author xgl
 * @date 2020/8/30 15:53
 *
 *
 *  1,  导入dubbo.starter依赖
 *      https://github.com/apache/dubbo-spring-boot-project
 *  2,
 *
 *
 *
 *
 **/
@EnableDubbo//开启基于注解dubbo功能
@SpringBootApplication
public class BootUserServiceProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootUserServiceProviderApplication.class, args);
    }

}

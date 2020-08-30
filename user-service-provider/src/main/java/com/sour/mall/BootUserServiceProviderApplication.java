package com.sour.mall;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 *
 *
 * @author xgl
 * @date 2020/8/30 15:53
 *
 *
 *  1,  导入dubbo.starter依赖
 *      https://github.com/apache/dubbo-spring-boot-project
 *
 *  springboot与dubbo整合的三种方式
 *      一,  导入dubbo-starter, 在application.properties配置属性, 使用@Service[暴露服务],
 *              使用@Reference[引用服务]
 *      二,  保留dubbo xml的配置文件
 *          @ImportResource(locations = "classpath:provide.xml")
 *      三,  使用注解API的方式
 *          重写配置类
 *
 *
 *
 **/
@EnableDubbo//开启基于注解dubbo功能
//@ImportResource(locations = "classpath:provide.xml") //使用配置文件的方式
@SpringBootApplication
public class BootUserServiceProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootUserServiceProviderApplication.class, args);
    }

}

package com.sour.mall.server.impl;


import com.sour.gmailinterface.bean.UserAddress;
import com.sour.gmailinterface.server.IOrderService;
import com.sour.gmailinterface.server.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * @author xgl
 * @date 2020/8/30 14:20
 *
 *  1,  将服务提供者注册到注册中心(暴露服务)
 *      1), 导入dubbo依赖(Dubbo All » 2.6.2)
 *      2), 导入依赖zookeeper的客户端(curator)
 *      3), 配置服务提供者provider.xml
 *          http://dubbo.apache.org/en-us/docs/user/quick-start.html
 *
 *  2,  让服务消费者去注册中心订阅服务提供者的服务地址
 *
 *
 **/
@Service
public class OrderServiceImpl implements IOrderService {

    /**
     * 自动去注册中心查找该方法
     */
    @Reference
    UserService userService;

    /**
     * 自动去注册中心查找该方法 (直连)
     */
//    @Reference(url = "127.0.0.1:20881")
//    UserService userService;

//    /**
//     * 自动去注册中心查找该方法 (负载均衡)(轮询)
//     */
//    @Reference(loadbalance = "RoundRobin")
//    UserService userService;

    @Override
    public List<UserAddress> initOrder(String userId) {

        // 1, 查询用户的收货地址
        List<UserAddress> userAddressList = userService.getUserAddressList(userId);
        System.out.println(userAddressList);

        return userAddressList;
    }
}

package com.sour.mall.controller;

import com.sour.gmailinterface.bean.UserAddress;
import com.sour.gmailinterface.server.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 *
 *
 * @author xgl
 * @date 2020/8/30 15:46
 **/
@Controller
public class OrderController {

    @Autowired
    IOrderService orderService;

    @ResponseBody
    @RequestMapping("/initOrder")
    public List<UserAddress> initOrder(@RequestParam("userId")String userId) {

        List<UserAddress> userAddresses = orderService.initOrder(userId);

        return userAddresses;
    }


}

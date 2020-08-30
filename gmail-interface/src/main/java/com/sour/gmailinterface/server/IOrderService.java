package com.sour.gmailinterface.server;

import com.sour.gmailinterface.bean.UserAddress;

import java.util.List;

/**
 * @author xgl
 * @date 2020/8/30 14:18
 **/
public interface IOrderService {


    /**
     * 初始化订单
     *
     * @param userId
     * @author xgl
     * @date 2020/8/30 14:19
     **/
    public List<UserAddress> initOrder(String userId);


}

package com.ltp.aop.entity;

public class WeChatPayService implements PayService {
    @Override
    public void pay() {
        System.out.println("微信支付");
    }
}

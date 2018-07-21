package com.ltp.aop.entity;

import org.springframework.stereotype.Component;

@Component
public class AliPayService implements PayService{
    @Override
    public void pay() {
        System.out.println("阿里支付");
    }
}

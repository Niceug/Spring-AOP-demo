package com.ltp.aop.entity;

public class AliPayService implements PayService{
    @Override
    public void pay() {
        System.out.println("阿里支付");
    }
}

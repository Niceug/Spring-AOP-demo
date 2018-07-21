package com.ltp.aop.static_proxy;

import com.ltp.aop.entity.PayService;

public class PayProxy implements PayService {
    private PayService payService;

    public PayProxy(PayService payService) {
        this.payService = payService;
    }

    @Override
    public void pay() {
        System.out.println("安全检查");
        payService.pay();
        System.out.println("日志记录");
    }
}

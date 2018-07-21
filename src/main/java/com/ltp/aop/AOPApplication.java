package com.ltp.aop;

import com.ltp.aop.entity.AliPayService;
import com.ltp.aop.static_proxy.PayProxy;
import com.ltp.aop.entity.PayService;

public class AOPApplication {
    public static void main(String[] args) {
        PayService payService = new PayProxy(new AliPayService());
        payService.pay();
    }
}

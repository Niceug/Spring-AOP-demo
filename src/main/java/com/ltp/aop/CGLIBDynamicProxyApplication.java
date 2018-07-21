package com.ltp.aop;

import com.ltp.aop.CGLIB_dynamic_proxy.CGLIBPayServiceProxyHandler;
import com.ltp.aop.entity.AliPayService;
import com.ltp.aop.entity.PayService;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;

public class CGLIBDynamicProxyApplication {
    public static void main(String[] args) {
        MethodInterceptor handler  = new CGLIBPayServiceProxyHandler(new AliPayService());
        PayService payService = (PayService) Enhancer.create(PayService.class, handler);
        payService.pay();
    }
}

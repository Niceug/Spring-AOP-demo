package com.ltp.aop;

import com.ltp.aop.dynamic_proxy.PayServiceProxyHandler;
import com.ltp.aop.entity.AliPayService;
import com.ltp.aop.entity.PayService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class DynamicProxyApplication {
    public static void main(String[] args) {
        InvocationHandler handler = new PayServiceProxyHandler(new AliPayService());
        PayService payService = (PayService) Proxy.newProxyInstance(AliPayService.class.getClassLoader(), new Class[]{PayService.class}, handler);
        payService.pay();
    }
}

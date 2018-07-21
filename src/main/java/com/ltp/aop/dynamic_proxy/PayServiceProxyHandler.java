package com.ltp.aop.dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class PayServiceProxyHandler implements InvocationHandler {
    private Object target;

    public PayServiceProxyHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("动态代理安全检查");
        Object obj = method.invoke(target, args);
        System.out.println("动态代理日志记录");
        return obj;
    }
}

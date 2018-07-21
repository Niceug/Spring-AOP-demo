package com.ltp.aop.CGLIB_dynamic_proxy;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CGLIBPayServiceProxyHandler implements MethodInterceptor{
    private Object target;

    public CGLIBPayServiceProxyHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("CGLIB动态代理之前");
        Object obj = method.invoke(target, objects);
        System.out.println("CGLIB动态代理之后");
        return obj;
    }
}

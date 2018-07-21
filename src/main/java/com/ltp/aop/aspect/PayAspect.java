package com.ltp.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;


/**
 * 定义切面
 */
@Aspect
@Component
public class PayAspect {
    @Pointcut(value = "execution(* com.ltp.aop.entity.PayService.pay())")
    public void payPointCut(){}

    @Before(value = "payPointCut()")
    public void beforePay() {
        System.out.println("支付之前");
    }

    @After(value = "payPointCut()")
    public void afterPay() {
        System.out.println("支付之后");
    }

    @Around(value = "payPointCut()")
    public void aroundPay(ProceedingJoinPoint joinPoint) {
        System.out.println("around before pay");

        try {
            joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

        System.out.println("around after pay");

    }

    @AfterReturning(value = "payPointCut()")
    public void afterPayReturning() {

    }


}

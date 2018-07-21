package com.ltp.aop;

import com.ltp.aop.entity.PayService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * AOP编程
 */
public class AspectApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        PayService payService = context.getBean(PayService.class);
        payService.pay();
    }
}

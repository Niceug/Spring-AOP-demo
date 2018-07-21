package com.ltp.aop;

import com.ltp.aop.entity.AliPayService;
import com.ltp.aop.entity.PayService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = {"com.ltp.aop"})
@EnableAspectJAutoProxy
public class AOPConfigApplication {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AOPConfigApplication.class);
        PayService payService = context.getBean(PayService.class);
        payService.pay();
    }
}

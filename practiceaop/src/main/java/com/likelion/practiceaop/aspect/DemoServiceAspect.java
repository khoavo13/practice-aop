package com.likelion.practiceaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class DemoServiceAspect {
    private Logger logger = LoggerFactory.getLogger(DemoServiceAspect.class);

    @Before("execution(* com.likelion.practiceaop.service.*.*(..))")
    public void beforeService(JoinPoint joinPoint){
        logger.info("Before called service " + joinPoint.toString());
    }

    @After("execution(* com.likelion.practiceaop.service.*.*(..))")
    public void afterService(JoinPoint joinPoint){
        logger.info("After called service " + joinPoint.toString());
    }

    @AfterThrowing("execution(* com.likelion.practiceaop.service.*.*(..))")
    public void afterFailed(JoinPoint joinPoint){
        logger.info("error: " + joinPoint.toString());
    }
}

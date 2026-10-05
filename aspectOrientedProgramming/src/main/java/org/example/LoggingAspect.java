package org.example;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.Arrays;
import java.util.logging.Logger;

@Aspect
public class LoggingAspect {
    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());
    @Around("execution(* org.example.services.*.*(..))")
    public Object log(ProceedingJoinPoint jointPoint) throws Throwable{
        logger.info("Method will Execute");
//        System.out.println(jointPoint.getSignature().getName());
        Object [] args = jointPoint.getArgs();
         Object obj = jointPoint.proceed();
         logger.info("Method argument"+ Arrays.asList(args));
        logger.info("Method Executed");
        return obj;
    }
}

package org.example;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.logging.Logger;

@Aspect
@Component
public class LoggingAspect {
Logger log = Logger.getLogger(LoggingAspect.class.getName());

@Around("@annotation(ToLog)")
public void deleteLog(ProceedingJoinPoint jointPoint) throws Throwable{
    log.info("calling delete");
    jointPoint.proceed();

}
@Around("@annotation(EditLog)")
    public void log(ProceedingJoinPoint jointPoint) throws Throwable{
    log.info("Calling the intercepted method");
    log.info(jointPoint.getSignature().getName());
    jointPoint.proceed();

}

}

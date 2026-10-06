package org.example;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
public class SecurityAspect {

    private Logger log = Logger.getLogger(SecurityAspect.class.getName());
@Around("@annotation(EditLog)")
    public void securityLog(ProceedingJoinPoint joinPoint)throws Throwable{
    log.info("inside the secuirty log");
    joinPoint.proceed();
    log.info("Secuirty Aspect Completed");
}
}

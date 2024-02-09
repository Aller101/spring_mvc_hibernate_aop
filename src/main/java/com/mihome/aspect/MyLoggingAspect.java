/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mihome.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

/**
 *
 * @author alekseynesterov
 */
@Component
@Aspect
public class MyLoggingAspect {
    
    @Around("execution(* com.mihome.dao.*.*(..))")
    public Object aroundAllRepositoryMethodsAdvice (
            ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        MethodSignature methodSignature =
                (MethodSignature) proceedingJoinPoint.getSignature();
        String methodName = methodSignature.getName();
        System.out.println("Begin of " + methodName);
        
        Object targetMeyhodResult = proceedingJoinPoint.proceed();
        System.out.println("End of " + methodName );
        return targetMeyhodResult;
    }
    
}

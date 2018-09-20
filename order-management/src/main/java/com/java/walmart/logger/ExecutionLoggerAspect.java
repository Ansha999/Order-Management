package com.java.walmart.logger;



import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ExecutionLoggerAspect {

	 @Around("execution(* com.java.walmart.service..*(..))")
	  public Object profileExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
	    long start = System.currentTimeMillis();
	    Object result = joinPoint.proceed();
	    long elapsedTime = System.currentTimeMillis() - start;
        System.out.println("API Execution time::"+elapsedTime +"ms");
	    return result;
	  }
}
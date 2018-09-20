package com.java.walmart.logger;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class InvocationLoggerAspect {
	
	@Before("execution(* com.java.walmart.service..*(..))")
	public void loggingAdvice() {
		System.out.println("Entered method::"+ System.currentTimeMillis());
	}

	@After("execution(* com.java.walmart.service..*(..))")
	public void loggicAdviceAfter() {
		System.out.println("Exited method::"+ System.currentTimeMillis());
	}
	  
}

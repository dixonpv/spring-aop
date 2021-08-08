/**
 * 
 */
package com.dixon.spring.springaop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @author dixon
 *
 */
@Aspect
public class LoggingAspect {
	
	@Before("execution(* com.dixon.spring.springaop.ProductServiceImpl.multiply(..))")
	public void logBefore(JoinPoint joinPoint) {	
		System.out.println("Before calling the method");
		
	}
	
	@After("execution(* com.dixon.spring.springaop.ProductServiceImpl.multiply(..))")
	public void logAfter(JoinPoint joinPoint) {
		System.out.println("After calling the method");
	}
	
}

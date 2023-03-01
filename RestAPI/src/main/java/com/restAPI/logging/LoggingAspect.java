package com.restAPI.logging;




import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import com.restAPI.exception.restAPIException;

@Component
@Aspect
public class LoggingAspect {
	public static final Log LOGGER = LogFactory.getLog(LoggingAspect.class);
	
	@Before("execution(* com.restAPI.service.*Impl.*(..))")
	public void before() throws restAPIException{
		LOGGER.info("Before advice called");
	}
	
//	@AfterThrowing(pointcut="execution(* com.restAPI.service.*Impl.*(..))", throwing="exception")
//	public void logServiceException(Exception exception){
//		LOGGER.error(exception.getMessage(), exception);
//	}

}

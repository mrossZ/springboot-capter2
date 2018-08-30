package com.springboot.chapter2.config;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springboot.chapter2.projo.User;

public class IoCTest {

	private static Log log = LogFactory.getLog(IoCTest.class); 

	public static void main(String[] args){
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		User user = ctx.getBean(User.class);		
		log.info(user.getId());
		log.info(user.getUserName());
	}
	
}

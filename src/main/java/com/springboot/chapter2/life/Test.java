package com.springboot.chapter2.life;

import org.springframework.beans.BeansException;

public interface Test {

	default Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		return bean;
	}

	
}

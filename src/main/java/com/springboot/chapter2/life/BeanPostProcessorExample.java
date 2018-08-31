package com.springboot.chapter2.life;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPostProcessorExample implements BeanPostProcessor{

	
	public Object postProcessBeforeInitialization(Object bean,String beanName) throws BeansException{		
		System.out.println("BeanPostProcessor调用"+"postProcessorBeforeInitialization方法,参数【"+bean.getClass().getSimpleName()+"】【"+beanName+"】");	
		return bean;
		
	}
	
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		return bean;
	}

}

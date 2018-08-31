package com.springboot.chapter2.projo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class BussinessPerson implements Person ,BeanNameAware,BeanFactoryAware,ApplicationContextAware,InitializingBean,DisposableBean{

	/**
	 * @Autowired
	 * 这个注解会根据属性的类型 找到对应的Bean进行注入
	 * 
	 */
	
	//@Autowired
	//@Qualifier("dog")//Spring IoC将会以【类型】和【名称】去寻找对应的Bean进行注入
	private Animal animal=null;

	/*
	public BussinessPerson(@Autowired @Qualifier("cat") Animal animal){
		this.animal = animal;
	}
	*/
	
	
	@Override
	public void service() {	
		this.animal.use();
	}

	@Override
	@Autowired @Qualifier("dog")
	public void setAnimal(Animal animal) {		
		System.out.println("延时依赖注入");
		this.animal = animal;
	}

	@PostConstruct
	public void init(){
		System.out.println("【"+this.getClass().getSimpleName()+"】注解@PostConstruct定义的自定义初始化方法");
	}
	
	@PreDestroy
	public void destory1(){
		System.out.println("【"+this.getClass().getSimpleName()+"】注解@PreDestroy定义的自定义销毁方法");
	}
	
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("【"+this.getClass().getSimpleName()+"】调用DisposableBean的destroy方法");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("【"+this.getClass().getSimpleName()+"】调用InitializingBean的afterPropertiesSet方法");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("【"+this.getClass().getSimpleName()+"】调用ApplicationContextAware的setApplicationContext方法");
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("【"+this.getClass().getSimpleName()+"】调用BeanFactoryAware的setBeanFactory方法");
	}

	@Override
	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		System.out.println("【"+this.getClass().getSimpleName()+"】调用BeanNameAware的setBeanName方法");
	}

}

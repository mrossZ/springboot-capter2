package com.springboot.chapter2.projo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Cat implements Animal{

	@Override
	public void use() {
	
		System.out.println("猫——"+Cat.class.getSimpleName()+"——是抓老鼠。");
		
	}

}

package com.springboot.chapter2.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import com.springboot.chapter2.projo.User;

@Configuration
//表明SpringIoC容器会扫描AppConfig类所在的当前包和其子包
@ComponentScan(basePackages="com.springboot.chapter2.*",lazyInit=true)
public class AppConfig {
	
}

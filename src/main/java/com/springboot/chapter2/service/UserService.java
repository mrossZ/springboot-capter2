package com.springboot.chapter2.service;

import org.springframework.stereotype.Service;

import com.springboot.chapter2.projo.User;

@Service
public class UserService {

	public UserService(){
		
	}
	
	public void printUser(User user){
		System.out.println("编号："+user.getId()+" 姓名："+user.getUserName());
	}

}

package com.ezen.spring.service;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.ezen.spring.vo.UserVO;

public class UserServiceTest {
	public static void main(String[] args) {
	
		AbstractApplicationContext applicationContext = new GenericXmlApplicationContext("root-context.xml");		
		
		UserService userService = (UserService)applicationContext.getBean("userService");
		
//		UserVO joinUser = new UserVO();
//		joinUser.setId("aws01");
//		joinUser.setPassword("1234");
//		joinUser.setName("홍길동");		
//		
//		userService.join(joinUser);
		
		// 회원 상세정보 조회
		// ID 세팅하기 위한 UserVO 객체
		UserVO infoUser = new UserVO();
		infoUser.setId("admin");
		
		UserVO user = userService.getUser(infoUser);		
		System.out.println(user.toString());
		
		applicationContext.close();
		
	}
}

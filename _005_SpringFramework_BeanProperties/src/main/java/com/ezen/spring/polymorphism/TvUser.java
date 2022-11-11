package com.ezen.spring.polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TvUser {

	public static void main(String[] args) {
		// 1. 스프링 컨테이너 구동 
		// 스프링 컨테이너 객체 생성				 어떤 파일을 읽어서 스프링 컨테이너를 구동할지
		AbstractApplicationContext factory = new GenericXmlApplicationContext("root-context.xml"); 
		
		// 2. DL과 DI
		// DL(Dependency Lookup): sTv라는 id를 가진 bean 객체를 찾음
		// DI(Dependency Injection): DL에서 찾은 bean객체를 tv에 의존성 주입
		// lazy-init 속성이 true일 때는 getBean으로 해당 객체를 요청하면 객체가 생성됨
		/*
		TV tv = (TV)factory.getBean("sTv");
		tv.on();
		tv.up();
		tv.down();
		tv.off();		
		*/
		TV tv1 = (TV)factory.getBean("sTv");
		TV tv2 = (TV)factory.getBean("sTv");
		TV tv3 = (TV)factory.getBean("sTv");
		
		// 3. 스프링 컨테이너 종료
		factory.close();
		
	}
}

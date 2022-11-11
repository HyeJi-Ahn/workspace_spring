package com.ezen.spring.polymorphism;

public class LgTV implements TV {
	public LgTV() {
		System.out.println("====> 엘지 티비 객체 생성");
	}
	@Override
	public void on() {
		System.out.println("LgTV --- 전원 켜기");
	}
	@Override
	public void off() {
		System.out.println("LgTV --- 전원 끄기");
	}
	@Override
	public void up() {
		System.out.println("LgTV --- 소리 증가");
	}
	@Override
	public void down() {
		System.out.println("LgTV --- 소리 감소");
	}
	
}

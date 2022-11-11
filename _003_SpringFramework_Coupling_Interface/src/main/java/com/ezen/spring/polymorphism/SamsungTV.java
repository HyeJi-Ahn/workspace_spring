package com.ezen.spring.polymorphism;

public class SamsungTV implements TV {
	@Override
	public void on() {
		System.out.println("SamsungTV --- 전원 켜기");
	}
	@Override
	public void off() {
		System.out.println("SamsungTV --- 전원 끄기");
	}
	@Override
	public void up() {
		System.out.println("SamsungTV --- 소리 증가");
	}
	@Override
	public void down() {
		System.out.println("SamsungTV --- 소리 감소");
	}
	
}

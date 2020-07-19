package com.springbook.biz;

public class LgTV implements TV {

	@Override
	public void powerOn() {
		System.out.println("LgTV on");
	}

	@Override
	public void powerOff() {
		System.out.println("LgTV off");
	}

	@Override
	public void volumeUp() {
		System.out.println("LgTV volume Up");
	}

	@Override
	public void volumeDown() {
		System.out.println("LgTV volume Down");
	}
	
}

package com.springbook.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("tv")
@Lazy
public class LgTV implements TV {
	
	@Autowired
	private Speaker ss;
	
	public LgTV() {
		System.out.println("LgTV 생성됨!!!!");
	}
	
	@Override
	public void powerOn() {
		System.out.println("LgTV -- 전원 켠다");
	}

	@Override
	public void powerOff() {
		System.out.println("LgTV -- 전원 끈다");
	}

	@Override
	public void volumeUp() {
		ss.volumeUp();
	}

	@Override
	public void volumeDown() {
		ss.volumeDown();
	}
	
	public void destroy() {
		System.out.println("LgTV 죽다");
	}
}

package com.springbook.biz;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("sTv")
@Lazy
public class SamsungTV implements TV {
	private Speaker speaker;
	private int price;
	
	
	public SamsungTV() {
		System.out.println("===> SamsungTV(1) 객체 생성");
	}
	
	public SamsungTV(Speaker speaker) {
		System.out.println("===> SamsungTV(2) 객체 생성");
		this.speaker = speaker;
	}
	
	public SamsungTV(Speaker speaker, int price) {
		System.out.println("===> SamsungTV(3) 객체 생성");
		this.speaker = speaker;
		this.price = price;
	}
	
	public void setSpeaker(Speaker speaker) {
		System.out.println("===>setSpeaker() 호출");
		this.speaker = speaker;
	}

	public void setPrice(int price) {
		System.out.println("===>setPrice() 호출");
		this.price = price;
	}

	@Override
	public void powerOn() {
		System.out.println("SamsungTV -- 전원 켠다");
	}

	@Override
	public void powerOff() {
		System.out.println("SamsungTV -- 전원 끈다");
	}

	@Override
	public void volumeUp() {
		speaker.volumeUp();
	}

	@Override
	public void volumeDown() {
		speaker.volumeDown();
	}

	public void printPrice() {
		System.out.println("price : " + price);
	}
	
	public void destroy() {
		System.out.println("");
	}
}

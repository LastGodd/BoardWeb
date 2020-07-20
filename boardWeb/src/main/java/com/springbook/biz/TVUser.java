package com.springbook.biz;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {
	public static void main(String[] args) {
		// 1. Spring 컨테이너를 구동한다.
		AbstractApplicationContext factory =
				new GenericXmlApplicationContext("applicationContext2.xml");
		
		// 2. Spring 컨테이너로부터 필요한 객체를 요청(Lookup)한다.
//		TV tv = (TV)factory.getBean("tv");
//		tv.powerOn();
//		tv.volumeUp();
//		tv.volumeDown();
//		tv.powerOff();
		CollectionBean cb = (CollectionBean)factory.getBean("CollectionBean");
		List<String> list = cb.getAddressList();
		for (String string : list) {
			System.out.println(string);
		}
		
		
		
		// 3. Spring 컨테이너를 종료한다.
		factory.close();
	}
}

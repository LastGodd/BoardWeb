package com.springbook.biz;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TvUserAnno {

	public static void main(String[] args) {
		AbstractApplicationContext factory =
				new GenericXmlApplicationContext("applicationcontextAnno.xml");

		TV lgTv = (TV)factory.getBean("tv");
		lgTv.powerOn();
		lgTv.powerOff();
		lgTv.volumeUp();
		lgTv.volumeDown();
		
		
		
		factory.close();
	}

}

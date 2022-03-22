package com.spring.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.lifecycle.Start;;

public class Test {

	public static void main(String[] args) {
		
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/spring/lifecycle/configlife.xml");
		context.registerShutdownHook();

		Start s=(Start) context.getBean("Per");
		System.out.println(s);
		
		System.out.println("----------------");

		Pepsi p=(Pepsi) context.getBean("Per1");
		System.out.println(p);
	}

}

package com.spring.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/ci/configci.xml");
		Person p=(Person) context.getBean("Per");
		System.out.println(p);
		
		

	}

}

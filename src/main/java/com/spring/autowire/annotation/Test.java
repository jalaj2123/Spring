package com.spring.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/autowire/annotation/configauto.xml");
	Emp emp=(Emp) context.getBean("emp");
	System.out.println(emp);
		
	}

}

package com.spring.collection;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String arg[])
{
	
	ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/collection/config2.xml");
	Emp emp1=(Emp)context.getBean("emp1");
    System.out.println(emp1.getName());
	System.out.println(emp1.getPhones());

	System.out.println(emp1.getAddress());
	System.out.println(emp1.getCourses());
}
}

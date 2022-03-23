package com.spring.collection;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.collection.standlone.Person;

public class Test {
public static void main(String arg[])
{
	
	ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/collection/standlone/config2.xml");

	Person p1=(Person)context.getBean("person1");
	System.out.println(p1.getFriends());
    
}
}

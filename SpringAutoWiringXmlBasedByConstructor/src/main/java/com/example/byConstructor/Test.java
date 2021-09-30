package com.example.byConstructor;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

	public class Test {
		public static void main(String[] args) {
			AbstractApplicationContext context=new ClassPathXmlApplicationContext("application3.xml");
			Employee emp=context.getBean("emp",Employee.class);
			System.out.println(emp);
		}
	}
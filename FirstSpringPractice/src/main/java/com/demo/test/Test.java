package com.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.model.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("springconfig.xml");
		Person pq = (Person) ctx.getBean("p1");

//		System.out.println(pq);
		Employee eq = (Employee) ctx.getBean("p2");
		System.out.println(eq);
		Address addr = (Address) ctx.getBean("addr");
		System.out.println(addr);
		MyUSer mu = (MyUSer) ctx.getBean("usr");
		System.out.println(mu);
	}

}

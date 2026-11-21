package com.example.spring.debug;

import com.example.spring.debug.bean.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClassPathXmlApplicationContextTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext application = new ClassPathXmlApplicationContext("my_application_context.xml");
		User user = (User) application.getBean("user");
		System.out.println("user=" + user);
	}

}

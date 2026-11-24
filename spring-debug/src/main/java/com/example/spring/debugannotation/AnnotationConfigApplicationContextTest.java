package com.example.spring.debugannotation;

import com.example.spring.debug.bean.Person;
import com.example.spring.debug.bean.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 注解方式
 *
 * @Configuration 标记当前类是一个配置类，类似于一个 bean.xml 配置文件，不设置这个注解也能正常启动 spring 容器
 * @ComponentScan 使用注解的方式一定要设置包路径扫描的注解，如果没有特殊配置，默认扫描的是当前类所在的目录及子目录
 */
@Configuration
@ComponentScan(basePackages = "com.example.spring")
public class AnnotationConfigApplicationContextTest {

	@Bean
	public Person getPerson() {
		return new Person();
	}

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AnnotationConfigApplicationContextTest.class);
		User bean = context.getBean(User.class);
		System.out.println("==> userBean=" + bean);

		Person person = context.getBean(Person.class);
		System.out.println("==> person=" + person);
	}

}

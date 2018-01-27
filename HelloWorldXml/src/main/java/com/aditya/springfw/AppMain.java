package com.aditya.springfw;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.aditya.springfw.configuration.HelloWorldConfig;
import com.aditya.springfw.model.HelloWorld;

public class AppMain {
	public static void main(String[] args) {
		
		AbstractApplicationContext ctx= new AnnotationConfigApplicationContext(HelloWorldConfig.class);
		HelloWorld bean= (HelloWorld) ctx.getBean("helloWorldBean");
		bean.sayHello("Spring 5");
	}

}

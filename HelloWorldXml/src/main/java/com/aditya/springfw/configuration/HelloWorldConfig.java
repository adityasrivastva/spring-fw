package com.aditya.springfw.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;

import com.aditya.springfw.model.HelloWorld;
import com.aditya.springfw.model.HelloWorldImpl;

@Configuration
public class HelloWorldConfig {
	
	@Bean(name="helloWorldBean")
	@Description("This is a sample HelloWorld Bean")
	public HelloWorld helloWorld() {
		return new HelloWorldImpl();
	}
	
}

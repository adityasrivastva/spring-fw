package com.aditya.springfw.model;

public class HelloWorldImpl implements HelloWorld {
	static {
		System.out.println("HelloWorldImpl SB");
	}

	@Override
	public void sayHello(String name) {

		System.out.println("Hello "+name);
	}

}

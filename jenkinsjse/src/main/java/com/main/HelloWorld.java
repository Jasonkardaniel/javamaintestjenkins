package com.main;

import com.service.HelloService;

public class HelloWorld {

	public static void main(String[] args) {
		HelloWorld helloWorld = new HelloWorld();
		String data =  helloWorld.callService("Happy");
		System.out.println(data);
		System.out.println("Happy learning");
	}

	public String callService(String name) {
		HelloService helloService = new HelloService();
		return helloService.sayHello(name);
	}
}

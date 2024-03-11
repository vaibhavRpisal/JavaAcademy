package com.publisher;

import jakarta.jws.WebService;

@WebService(endpointInterface = "com.publisher.hello")
public class HelloImplementation implements hello{
	
		@Override
		public String sayHelloWorld(String content) {
			return "Hello " + content + " !";
		}
}

package com.publisher;

import jakarta.xml.ws.Endpoint;

public class Publisher {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8090/ws/hello", new HelloImplementation());
		System.out.println("Service is running");
}
}
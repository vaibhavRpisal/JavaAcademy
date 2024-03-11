package com.client;
 
import jakarta.xml.ws.Service;

 
import javax.xml.namespace.QName;

import com.publisher.hello;

import java.net.URL;
 
public class HelloWorldClient {
	public static void main(String[] args) throws Exception{
		URL url = new URL("http://localhost:8090/ws/hello?wsdl");
		QName qname=new QName("http://publisher.com/","HelloImplementationService");
		Service service=Service.create(url,qname);
		hello port=service.getPort(hello.class);
		System.out.println(port.sayHelloWorld("vaibhav"));
	}

}
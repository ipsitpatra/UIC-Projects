package com.demo;

import javax.jws.WebService;

@WebService(endpointInterface="com.demo.CalWebService", portName="calWebServicePort", serviceName= "calWebService")
public class CalWebServiceImpl implements CalWebService {

	@Override
	public String add(int a, int b) {
		return "Hello" +a+b;//
	}

}

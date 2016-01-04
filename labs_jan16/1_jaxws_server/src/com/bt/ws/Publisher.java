package com.bt.ws;

import javax.xml.ws.Endpoint;

import com.bt.ws.service.CustomerServiceImpl;

public class Publisher {
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8080/btcrm", new CustomerServiceImpl());
	}
}

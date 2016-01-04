package com.bt.ws.service;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

import javax.jws.WebService;

import com.bt.ws.api.CustomerService;
import com.bt.ws.entity.Customer;

@WebService(endpointInterface="com.bt.ws.api.CustomerService")
public class CustomerServiceImpl implements CustomerService {
	private static Map<Long, Customer> customersInmemory = new TreeMap<>();

	@Override
	public Customer createCustomer(Customer newCustomer) {
		long newId = customersInmemory.size() + 1L;
		newCustomer.setId(newId);
		
		customersInmemory.put(newCustomer.getId(), newCustomer);
		return newCustomer;
	}

	@Override
	public Collection<Customer> getCustomers() {
		return customersInmemory.values();
	}
	
	
}

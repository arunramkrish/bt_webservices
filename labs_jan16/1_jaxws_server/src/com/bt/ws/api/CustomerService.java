package com.bt.ws.api;

import java.util.Collection;

import javax.jws.WebService;

import com.bt.ws.entity.Customer;

@WebService
public interface CustomerService {
	Customer createCustomer(Customer newCustomer);
	
	Collection<Customer> getCustomers();
}

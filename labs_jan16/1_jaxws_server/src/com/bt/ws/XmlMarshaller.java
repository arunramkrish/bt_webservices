package com.bt.ws;

import java.io.FileWriter;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.bt.ws.entity.Customer;
import com.bt.ws.entity.Status;

public class XmlMarshaller {
	public static void main(String[] args) {
		try {
			JAXBContext context = JAXBContext.newInstance(Customer.class);
			Marshaller m = context.createMarshaller();
			
			Customer c = getCustomer();
			m.marshal(c, new FileWriter("customer.xml"));
			
		} catch (JAXBException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	private static Customer getCustomer() {
		Customer c= new Customer();
		c.setName("Demo1");
		c.setStatus(Status.ACTIVE);
		c.setPhoneNumber("8765857865");
		
		return c;
	}
}

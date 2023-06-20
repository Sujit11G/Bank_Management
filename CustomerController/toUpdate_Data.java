package com.jsp.CustomerController;

import com.jsp.dto.Customer;
import com.jsp.services.CustomerService;

public class toUpdate_Data {

	public static void main(String[] args) {
		
		
		CustomerService customerService=new CustomerService();
		
		Customer customer=customerService.updateData(1, "Sujit", "sujit@gmail.com");
		
		System.out.println("Updated Name: "+customer.getName());
		System.out.println("Updated Email: "+customer.getEmail());
		
		
		
	}
}

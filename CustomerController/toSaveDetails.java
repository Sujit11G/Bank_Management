package com.jsp.CustomerController;

import com.jsp.dto.Customer;
import com.jsp.dto.Pan;
import com.jsp.services.CustomerService;

public class toSaveDetails {

public static void main(String[] args) {
	
	CustomerService customerService=new CustomerService();
	Customer customer=new Customer();
	
	Pan pan=new Pan();
	customerService.saveDetails(customer);
	
	pan.setPan_no("12563");
	customer.setPan(pan);
	
	
	
	customer.setName("Sujit");
	customer.setEmail("sujit@gmail.com");
	
	
	customerService.saveDetails(customer);
	
	

}
}

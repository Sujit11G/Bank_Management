package com.jsp.controller;


import com.jsp.dto.BankAccount;
import com.jsp.dto.Customer;
import com.jsp.dto.Pan;
import com.jsp.services.CustomerService;

public class SaveCustomer {

	public static void main(String[] args) {
		
		CustomerService customerService=new CustomerService();
		Customer customer=new Customer();
		BankAccount account=new BankAccount();
		Pan pan=new Pan();
		
		
		pan.setPan_no("789563");
		pan.setCustomer(customer);
		
		
		//pan.setCustomer(customer);
		//customer.setPan(pan);
		
		
		
		customer.setEmail("abc@gmail.com");
		
		
		
		Customer c=customerService.saveDetails(customer);
		
		
	}
}

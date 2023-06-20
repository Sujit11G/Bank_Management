package com.jsp.CustomerController;

import com.jsp.dto.Customer;
import com.jsp.services.CustomerService;

public class toFetch_Details_By_ID {

public static void main(String[] args) {
		
		
		CustomerService customerService=new CustomerService();
		
		Customer customer=customerService.getCustomerByID(1);
		
		System.out.println(customer.getEmail());
		System.out.println(customer.getBankAccount().getAcc_no());
		
		System.out.println(customer.getPan().getPan_no());
	}
}

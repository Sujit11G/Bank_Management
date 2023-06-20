package com.jsp.ManagerController;

import java.util.List;

import com.jsp.dto.Customer;
import com.jsp.services.ManagerServices;

public class toView_Customer_By_ID {

public static void main(String[] args) {
		
		ManagerServices managerServices=new ManagerServices();
		
		List<Customer> customers=managerServices.viewAllCustomerDetails(1);
	}
}

package com.jsp.ManagerController;

import com.jsp.dto.Customer;
import com.jsp.services.ManagerServices;

public class toApprove_Customer_By_ID {


	public static void main(String[] args) {
		Customer customer=new Customer();
		ManagerServices managerServices=new ManagerServices();
		
		
		 customer=managerServices.approveCustomerByID(1, 1,"Approve");
		System.out.println();
		System.out.println(customer.getStatus());
		
	}
}

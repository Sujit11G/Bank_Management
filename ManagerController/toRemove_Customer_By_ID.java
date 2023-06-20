package com.jsp.ManagerController;

import com.jsp.services.ManagerServices;

public class toRemove_Customer_By_ID {

public static void main(String[] args) {
		
		ManagerServices managerServices=new ManagerServices();
		
		boolean customer=managerServices.deleteCustomerDetailsByID(1, 1);
		
		if(customer==true) {
			System.out.println("Customer Data Deleted");
		}else {
			System.out.println("Wrong ID");
		}
	}
}

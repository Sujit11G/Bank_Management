package com.jsp.ManagerController;

import com.jsp.services.ManagerServices;

public class toDelete_Customer_ID {

public static void main(String[] args) {
		
		ManagerServices managerServices=new ManagerServices();
		
		boolean customer=managerServices.deleteCustomerDetailsByID(2,2);

		if(customer==true) {
			System.out.println("Customer ID Deleted");
		}else {
			System.out.println("Wrong ID");
		}
	}
}

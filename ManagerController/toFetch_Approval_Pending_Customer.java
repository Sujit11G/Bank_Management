package com.jsp.ManagerController;

import java.util.List;

import com.jsp.dto.Customer;
import com.jsp.services.ManagerServices;

public class toFetch_Approval_Pending_Customer {

	//===========================toFetch_All__Pending_Approval_Customer_Status============================
	
		//===================================By_Manager_ID========================================
		
		public static void main(String[] args) {
			
			ManagerServices managerServices=new ManagerServices();
			
			List<Customer> customers =managerServices.fetchStatus(1);
			
		}
}

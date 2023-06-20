package com.jsp.ManagerController;


import com.jsp.dto.Manager;

import com.jsp.services.ManagerServices;

public class to_Upadate_Data {

	public static void main(String[] args) {
		
		
		ManagerServices managerServices=new ManagerServices();
		
		Manager manager=managerServices.updateManagerData(1, "Mark", "mark@email.com");
		
		System.out.println("Updated Name: "+manager.getName());
		System.out.println("Updated Email: "+manager.getEmail());
	}
}

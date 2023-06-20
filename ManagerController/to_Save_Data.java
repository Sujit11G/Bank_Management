package com.jsp.ManagerController;

import com.jsp.dto.Manager;
import com.jsp.services.ManagerServices;

public class to_Save_Data {

public static void main(String[] args) {
		
		ManagerServices managerServices=new ManagerServices();
		Manager manager=new Manager();
		
		manager.setName("Jhon");
		manager.setEmail("jhon@gmail.com");
		
		managerServices.saveManagerDetails(manager);
	}
}

package com.jsp.ManagerController;


import com.jsp.dao.ManagerDao;
import com.jsp.services.ManagerServices;

public class toDelete_Customer_ID {

	public static void main(String[] args) {
		
		ManagerServices managerServices=new ManagerServices();
		ManagerDao managerDao=new ManagerDao();
	
		boolean b=managerDao.deleteManagerDetails(1);
		
		
	}
}

package com.jsp.services;

import java.util.List;

import com.jsp.dao.BankDao;
import com.jsp.dao.ManagerDao;
import com.jsp.dto.Bank;
import com.jsp.dto.Manager;

public class BankServices {

	BankDao bankDao=new BankDao();
	ManagerDao managerDao=new ManagerDao();
	//===================================toSave Bank Details=========================
	
	public Bank saveBankData(Bank bank) {
		
		return bankDao.saveBank(bank);

	}
	
	//===================================toFetch Bank Data============================
	
	public Manager fetchManagerDataByID( int id) {
		
		return bankDao.fetchDataByID(id);
	}
	
	//================================to Fetch All Manager============================
	
	public List<Manager> fetchAllManager(){
		
		return managerDao.getAllManagerDetails();
	}
	
}

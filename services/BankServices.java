package com.jsp.services;

import com.jsp.dao.BankDao;
import com.jsp.dto.Bank;

public class BankServices {

	BankDao bankDao=new BankDao();
	//===================================toSave Bank Details=========================
	
	public Bank saveBankData(Bank bank) {
		
		return bankDao.saveBank(bank);

	}
	
	//===================================toFetch Bank Data============================
	
	public Bank fetchBankDataByID( int id) {
		
		return bankDao.fetchDataByID(id);
	}
	
}

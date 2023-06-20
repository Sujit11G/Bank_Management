package com.jsp.controller;

import com.jsp.dto.Bank;
import com.jsp.services.BankServices;

public class BankController {

	public static void main(String[] args) {
		
		BankServices bankServices=new BankServices();
		Bank bank =new Bank();
		
		bank.setName("HDFC");
		bank.setCity("MUMBAI");
  
		bankServices.saveBankData(bank);
	}
}

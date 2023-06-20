package com.jsp.CustomerController;

import com.jsp.services.BankAccountService;

public class toDebit_Amount {

	public static void main(String[] args) {
		
		BankAccountService accountService=new BankAccountService();
				
				accountService.debitAmount(2,2, 1000);
				System.out.println();
			}
}

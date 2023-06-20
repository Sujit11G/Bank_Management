package com.jsp.CustomerController;

import com.jsp.services.BankAccountService;

public class toCredit_Amount {


		public static void main(String[] args) {
			
			BankAccountService accountService=new BankAccountService();
			
			accountService.creditAmount(2,2, 1000);
		}
}

package com.jsp.services;

import com.jsp.dao.BankAccountDao;
import com.jsp.dao.CustomerDao;
import com.jsp.dto.BankAccount;
import com.jsp.dto.Customer;


public class BankAccountService {

	CustomerDao customerDao=new CustomerDao();
	BankAccountDao bankAccountDao=new BankAccountDao();
	BankAccount bankAccount=new BankAccount();
	Customer customer=new Customer();
	CustomerService customerService=new CustomerService();
	
	

//=====================================to_Fetch_By_ID=====================================
	
	public BankAccount fetchPanByID(int id) {
		
		return bankAccountDao.fetchBankAccountByID(id);
	}
	

	//==================================toCredit Amount===========================================
	
	
	public BankAccount creditAmount(int customer_id,int account_id,double amount) {
		
		BankAccount account=bankAccountDao.fetchBankAccountByID(account_id);
		Customer customer=customerDao.fetchCustomerByID(customer_id);
		
		if(account!=null) {
			
			if(customer!=null) {
			
				if(customer.getStatus()!=null) {
					if(account.getId()==customer.getId()) {
						account.setBalance(account.getBalance()+amount);
						System.out.println("Amount " + amount + " credited to your account. Avl Bal Rs:"+account.getBalance());
						bankAccountDao.transaction(account);
						
					}else 
						System.out.println("Wrong ID");
					
				}else
					System.out.println("Status is Not Approved...");
			}
			else
				System.out.println("Customer Id Not Found");	
		}else 
			System.out.println("Account Id Not Found");
		return account;
		
       }

    //========================================toDebit Amount=========================================
        
            public BankAccount debitAmount(int customer_id,int account_id,double amount) {
	
	BankAccount account=bankAccountDao.fetchBankAccountByID(account_id);
	Customer customer=customerDao.fetchCustomerByID(customer_id);
	
	if(account!=null) {
		
		if(customer!=null) {
		
			if(customer.getStatus()!=null) {
				if(account.getId()==customer.getId()) {
					
					if(account.getBalance()>amount) {
						account.setBalance(account.getBalance()-amount);
						
						System.out.println("Amount " + amount + " debited from your account. Avl Bal Rs:"+account.getBalance());
						
						bankAccountDao.transaction(account);
						}
						else {
							System.out.println("Insufficient balance. Debit transaction failed.");
							return null;
						}
					
				}else 
					System.out.println("Wrong ID");
				
			}else
				System.out.println("Status is Not Approved...");
		}
		else
			System.out.println("Customer Id Not Found");	
	}else 
		System.out.println("Account Id Not Found");
	return account;
	
   }






	}


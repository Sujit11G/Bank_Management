package com.jsp.services;

import java.util.List;

import com.jsp.dao.BankAccountDao;
import com.jsp.dao.CustomerDao;
import com.jsp.dao.PanDao;
import com.jsp.dto.BankAccount;
import com.jsp.dto.Customer;
import com.jsp.dto.Pan;

public class CustomerService {

	CustomerDao customerDao=new CustomerDao();
	PanDao panDao=new PanDao();
	BankAccountDao accountDao=new BankAccountDao();
	BankAccount bankAccount=new BankAccount();
	Pan pan=new Pan();
	Customer customer = new Customer();
	
	
	//=========================toSave Customer Details=====================
	
	public Customer saveDetails(Customer customer) {
	
		
		int customer_ID=customer.getId();
		
		BankAccount bankAccount=customer.getBankAccount();
		accountDao.saveBankAccount(bankAccount, customer_ID);
		
		 
		 Pan pan=customer.getPan();
		 panDao.savePan(pan, customer_ID);
		 
		return customerDao.saveCustomer(customer);
	}
	


	
	//=============================toUpdate Customer Details==================
	
	public Customer updateCustomerDeta(int id,String status) {
		customerDao=new CustomerDao();
	       
		Customer customer=customerDao.fetchCustomerByID(id);
		 customer.setStatus(status);
		
		return customerDao.updateCustomerDetails(customer,id);
	}

	//===============================toFetch Customer Details===============================
	
	public Customer getCustomerByID(int id) {
		
		Pan pan=panDao.fetchPan(id);
		customer.setPan(pan);
		
		BankAccount account=accountDao.fetchBankAccountByID(id);
		customer.setBankAccount(account);
		
		
		return customerDao.fetchCustomerByID(id);
	}
	//================================toFetch All Customer Details==========================
	
	public List<Customer> getAllCustomer(){
		
		return customerDao.getAllCustomerData();
	}
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

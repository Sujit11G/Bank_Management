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
	


	
	//=================================toUpdate Customer Status===========================
	//=====================================By_Manager_ID===============================
	
	public Customer updateCustomerDeta(int id,String status) {
		
	       
		Customer customer=customerDao.fetchCustomerByID(id);
		 customer.setStatus(status);
		
		return customerDao.updateCustomerDetails(customer,id);
	}

	//===============================toFetch Customer Details===============================
	
	public Customer getCustomerByID(int id) {
			
		return customerDao.fetchCustomerByID(id);
	}
	//================================toFetch All Customer Details==========================
	
	public List<Customer> getAllCustomer(){
		
		return customerDao.getAllCustomerData();
	}
	
	//====================================toUpdate_Customer_Data===============================
	


	public Customer updateData(int id,String name,String email) {
		
		Customer customer=customerDao.fetchCustomerByID(id);
		customer.setName(name);
		customer.setEmail(email);
		
		return customerDao.updateCustomerDetails(customer, id);
		
	}
	
	//=================================toDelete_Customer_Data==============================
	
	public boolean deleteCustomer(int id) {
		
		if(id>0) {
			return customerDao.deleteCustomerDetails(id);
		}else {
			System.out.println("Wrong ID");
			return false;
		}
	}
	
	
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


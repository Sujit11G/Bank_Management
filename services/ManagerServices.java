package com.jsp.services;

import java.util.List;

import com.jsp.dao.BankAccountDao;
import com.jsp.dao.BankDao;
import com.jsp.dao.CustomerDao;
import com.jsp.dao.ManagerDao;
import com.jsp.dto.Bank;
import com.jsp.dto.BankAccount;
import com.jsp.dto.Customer;
import com.jsp.dto.Manager;
import com.jsp.dto.Pan;

public class ManagerServices {

	ManagerDao managerDao=new ManagerDao();
	CustomerService customerService=new CustomerService();
	CustomerDao customerDao=new CustomerDao();
	Manager manager=new Manager();
	Customer customer=new Customer();
	
	
	//=======================toSave Manager Details=====================
	
	public Manager saveManagerDetails(Manager manager) {
		
		return managerDao.saveManager(manager);
	}
	
	//========================toFetch Manager Details===================
	
	public Manager fetchManagerDetails(int id) {
		
		return managerDao.fetchManagerByID(id);
	}
	
	//============================toFetch All Customer Details============================
	
	public Customer fetchAllCustomerDetails(int id) {
		
		return customerDao.fetchCustomerByID(id);
	}
	
	//================================toUpdate_Manager_Data=========================
	
	public Manager updateManagerData(int id,String name,String email) {
		
		Manager manager=managerDao.fetchManagerByID(id);
		manager.setName(name);
		manager.setEmail(email);
		return managerDao.updateManagerDetailsByID(manager, id);
	}
	
	//======================toFetch_All_Approval_Pending_Customer_Status============================
	//=================================By_Manager_ID========================================
	
	public List<Customer> fetchStatus(int id) {

		List<Customer> customers=fetchAllCustomer(id);

		for(Customer c:customers) {
			if(c.getStatus()==null) {
				System.out.println("Here are Approval pending Customers");
				System.out.println("Customer ID: "+c.getId());
			    System.out.println("Customer Name "+c.getName());
			    System.out.println();
			
			}else {
				System.out.println("All Customers are Approvaed");
			}
		
		}
		return fetchAllCustomer(id);
	}
	
	//===========================toFetch_AllCustomer_Data==================================
			//=========================By_Managers_ID=================================
	

	public List<Customer> fetchAllCustomer(int manager_id){
		
		Manager manager=managerDao.fetchManagerByID(manager_id);
		
		List<Customer>customers=customerDao.getAllCustomerData();
		if(customer!=null) {
			for(Customer c:customers ) {
			
				if(manager.getManager_id()==c.getManager().getManager_id()) {
					System.out.println("Customer ID: "+c.getId());
					System.out.println("Customer Name: "+c.getName());
					System.out.println("Customer Email: "+c.getEmail());
					System.out.println("Customer Account No: "+c.getBankAccount().getAcc_no());
					System.out.println("Customer Account_Type: "+c.getBankAccount().getAcc_type());
					System.out.println("Customer Balance: "+c.getBankAccount().getBalance());
					System.out.println("Customer Pan :"+c.getPan().getPan_no());
				}
				
				//return managerDao.allCustomer(manager_id);
			}
		}
		
		return customers;
	}
	
	
	
	//==============================toSet_Status_Customer_Approval================================
          //==============================By_Manager_ID======================================
	
	public Customer approveCustomerByID(int bank_manager_id,int customer_id,String status) {
		
		Customer customer=customerService.getCustomerByID(customer_id);
		Manager manager=managerDao.fetchManagerByID(bank_manager_id);
		
		if(customer.getStatus()==null) 
		{
			
			if(manager.getManager_id()==customer.getManager().getManager_id())
			{
				customer.setStatus(status);
				customerService.updateCustomerDeta(customer_id,status);
				
				
			}else {
				System.out.println("ID didn't Matched");
			}
		}
		 else {
		System.out.println("Customer is first Approved");
		 }
		return customer;
	}
		
	//================================toDelete_Customer_Data==============================
	
	    //================================By_Manager_ID=============================
	
	public boolean deleteCustomerByID(int customer_id) {
		
	
		if(manager!=null) {
		
               return managerDao.deleteManagerDetails(customer_id);
		}else return false;		
		
	} 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

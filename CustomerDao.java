package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.BankAccount;
import com.jsp.dto.Customer;
import com.jsp.dto.Manager;
import com.jsp.dto.Pan;


public class CustomerDao {

EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("sujit");
	
	EntityManager entityManager =entityManagerFactory.createEntityManager();
	
	EntityTransaction entityTransaction= entityManager.getTransaction();
	
	Customer customer=new Customer();
	
	//==============================toSave Customer Details======================
	
	public Customer saveCustomer(Customer customer) {
		
		entityTransaction.begin();
		entityManager.persist(customer);
		entityTransaction.commit();
		
		return customer;
	}
	
	//=============================toFetch Customer Details=====================
	
	public Customer fetchCustomerByID(int id) {
		
		return entityManager.find(Customer.class, id);
	}
	
	//============================toFetch All Customer Details=====================
	
	public List<Customer> getAllCustomerData(){
		
		String jpql="SELECT c FROM Customer c";
		Query query=entityManager.createQuery(jpql);
		
		List<Customer> customers=query.getResultList();
		
		return customers;			
	}
	
	//===========================toDelete Customer Details========================
	
	public boolean deleteCustomerDetails(int id) {
		
		Customer customer=entityManager.find(Customer.class, id);
		
		entityTransaction.begin();
		entityManager.remove(customer);
//		entityManager.remove(account);
//		entityManager.remove(pan);
//		entityManager.remove(manager);
		entityTransaction.commit();
		
		return true;	
	}
	
	//=============================toUpdate Customer Details=========================
	
	public Customer updateCustomerDetails(Customer customer,int id) {
		
		if(customer!=null) {
			entityTransaction.begin();
			entityManager.persist(customer);
			entityTransaction.commit();
				
			return customer;
		}
		return null;
	}
	
	
	
	
	
	
	
	
	
	
}

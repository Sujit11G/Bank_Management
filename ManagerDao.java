package com.jsp.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Bank;
import com.jsp.dto.BankAccount;
import com.jsp.dto.Customer;
import com.jsp.dto.Manager;
import com.jsp.dto.Pan;
import com.jsp.services.CustomerService;

public class ManagerDao {

EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("sujit");
	
	EntityManager entityManager =entityManagerFactory.createEntityManager();
	
	EntityTransaction entityTransaction= entityManager.getTransaction();
	
	CustomerDao customerDao=new CustomerDao();
	Customer customer = new Customer();
	 Manager manager=new Manager();
	 Bank bank=new Bank();
	 Pan pan=new Pan();
	 BankAccount account=new BankAccount();
	 
	 CustomerService customerService=new CustomerService();
	
	//==============================toSave Manager Details====================
	
	public Manager saveManager(Manager manager) {
		
		entityTransaction.begin();
		entityManager.persist(manager);
		entityTransaction.commit();
		
		return manager;
	}
	
	//===============================toFetch Manager Details========================
	
	public Manager fetchManagerByID(int id) {
		
		return entityManager.find(Manager.class, id);
	}
	
	//===============================toDelete Manager Details======================

	public boolean deleteManagerDetails(int id1) {
	
		
		manager=entityManager.find(Manager.class, id1);
		//customer=entityManager.find(Customer.class, id2);
		
		
			entityTransaction.begin();
			
			entityManager.remove(customer);	
			entityTransaction.commit();
			
			return true;
					
	}
	
	//==============================toFetching All Manager Details===============================
	
		public List<Manager>  getAllManagerDetails(){
			
			String jpql="SELECT m FROM Manger m";
			
			Query query=entityManager.createQuery(jpql);
			
			List<Manager> managers=query.getResultList();
			
			return managers;
		}
	//===============================toUpdate Manager Details=============================
		
		public Manager updateManagerDetailsByID(Manager manager,int id) {
			
			if(manager!=null) {
				entityTransaction.begin();
				entityManager.persist(manager);
				entityTransaction.commit();
				
				return manager;
			}
			return null;
			
		}
		
	
		
		


		
		
}

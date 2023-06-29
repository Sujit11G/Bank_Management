package com.jsp.controller;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import com.jsp.dto.Bank;
import com.jsp.dto.BankAccount;
import com.jsp.dto.Customer;
import com.jsp.dto.Manager;
import com.jsp.dto.Pan;

public class Controller {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("sujit");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		

		
		Bank bank=new Bank();
		
		Manager m1=new Manager();
		m1.setEmail("jhon@.com");
		m1.setName("Jhon");
		
		Manager m2=new Manager();
		m2.setEmail("smith@.com");
		m2.setName("Smith");
		
		ArrayList<Manager> managers=new ArrayList<Manager>();
		managers.add(m1);
		managers.add(m2);
		
		
		BankAccount ba1=new BankAccount();
		ba1.setAcc_no(123654);
		ba1.setAcc_type("Saving");
		ba1.setBalance(10000);
		ba1.setIfsc("QWER7896");
		//ba1.setCustomer(customer);
		
		BankAccount ba2=new BankAccount();
		ba2.setAcc_no(145698);
		ba2.setAcc_type("Current");
		ba2.setBalance(10000);
		ba2.setIfsc("ASDF4563");
		//ba2.setCustomer(customer);
		
		ArrayList<BankAccount> bankAccounts=new ArrayList<BankAccount>();
		bankAccounts.add(ba1);
		bankAccounts.add(ba2);
		
		
		
		bank.setCity("Mumbai");
		bank.setName("HDFC");
		bank.setBankAccounts(bankAccounts);
		bank.setManagers(managers);
		
		Customer c1=new Customer();
		c1.setName("Parth");
		c1.setEmail("parth@.com");
		//c1.setPan(pan);
		
		Customer c2=new Customer();
		c2.setName("Sanskar");
		c2.setStatus("Approved");
		c2.setEmail("sanskar@.com");
		//c2.setPan(pan);
			
		ArrayList<Customer> customers=new ArrayList<Customer>();
		customers.add(c1);
		
		ArrayList<Customer> customers1=new ArrayList<Customer>();
		customers1.add(c2);
		
		ba1.setCustomer(c1);
		ba2.setCustomer(c2);
		
		c1.setBankAccount(ba1);
		c2.setBankAccount(ba2);

		c1.setManager(m1);
		m1.setCustomer(customers);
		
		c2.setManager(m2);
		m2.setCustomer(customers1);
		
		bank.setCustomers(customers1);
		bank.setCustomers(customers);
		
		
	
		
		Pan p1=new Pan();
		p1.setPan_no("ZXERY1236C");
		p1.setCustomer(c1);
		
		Pan p2=new Pan();
		p2.setPan_no("AQRTY5874V");
		p2.setCustomer(c2);
		
		c1.setPan(p1);
		c2.setPan(p2);
		
		entityTransaction.begin();
		entityManager.persist(ba1);
		entityManager.persist(ba2);
		entityManager.persist(c1);
		entityManager.persist(c2);
		entityManager.persist(m1);
		entityManager.persist(m2);
		entityManager.persist(p1);
		entityManager.persist(p2);
	    entityManager.persist(bank);
		entityTransaction.commit();
		
		
		
	}
}

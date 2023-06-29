package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import com.jsp.dto.Bank;
import com.jsp.dto.Manager;

public class BankDao {

EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("sujit");
	
	EntityManager entityManager =entityManagerFactory.createEntityManager();
	
	EntityTransaction entityTransaction= entityManager.getTransaction();
	
	//=============================toSave Bank Details============================
	
	public Bank saveBank(Bank bank) {
		
		entityTransaction.begin();
		entityManager.persist(bank);
		entityTransaction.commit();
		
		return bank;
		
	}
	
	//==============================toFetch Manager Details=============================
	
	public Bank fetchDataByID(int id) {
		
		return entityManager.find(Bank.class, id);
	}
	
	
	
	
	
	
}

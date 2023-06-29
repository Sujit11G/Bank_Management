package com.jsp.dao;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import com.jsp.dto.BankAccount;


public class BankAccountDao {
EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("sujit");
	
	EntityManager entityManager =entityManagerFactory.createEntityManager();
	
	EntityTransaction entityTransaction= entityManager.getTransaction();
	
//================================toSave_BankAccount_Details==========================

	public BankAccount saveBankAccount(BankAccount bankAccount,int id) {
		
		entityTransaction.begin();
		entityManager.persist(bankAccount);
		entityTransaction.commit();
		
		return bankAccount;
	}
	
	//===============================toFetch_BankAccount_Data==========================

	public BankAccount fetchBankAccountByID(int id) {
		
		return entityManager.find(BankAccount.class, id);
	}
	
	
	
	//=====================================Transaction Method================================

	public BankAccount transaction(BankAccount bankAccount) {
	
		if(bankAccount!=null) {
			entityTransaction.begin();
			entityManager.merge(bankAccount);
			entityTransaction.commit();
			
			return bankAccount;
		}
		else
			return null;
			
	}
}

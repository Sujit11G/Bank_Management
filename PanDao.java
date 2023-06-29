package com.jsp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.dto.Pan;

public class PanDao {

EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("sujit");
	
	EntityManager entityManager =entityManagerFactory.createEntityManager();
	
	EntityTransaction entityTransaction= entityManager.getTransaction();
	
	//==========================toSave Pan=============================
	
	public Pan savePan(Pan pan,int id) {
		
		entityTransaction.begin();
		entityManager.persist(pan);
		entityTransaction.commit();
		
		return pan;
	}
	
	//============================toFetch Pan=======================
	
	public Pan fetchPan(int id) {
		
		return entityManager.find(Pan.class, id);
			
	} 
}

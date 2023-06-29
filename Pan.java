package com.jsp.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Pan {

	@Id  		
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pan_id;
	private String pan_no;
	
	@OneToOne
	private Customer customer;

	public int getPan_id() {
		return pan_id;
	}

	public void setPan_id(int pan_id) {
		this.pan_id = pan_id;
	}

	public String getPan_no() {
		return pan_no;
	}

	public void setPan_no(String pan_no) {
		this.pan_no = pan_no;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	
}

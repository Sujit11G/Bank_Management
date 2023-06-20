package com.jsp.services;

import com.jsp.dao.PanDao;
import com.jsp.dto.Pan;

public class PanServices {

	PanDao panDao=new PanDao();
	//=========================toSave Pan===============
	
	
	
	public Pan fetchPanByID(int id) {
		
		return panDao.fetchPan(id);
	}
}

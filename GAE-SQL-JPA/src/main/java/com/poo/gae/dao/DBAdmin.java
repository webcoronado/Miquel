package com.poo.gae.dao;

import java.util.HashSet;
import java.util.Set;

import model.Admin;

public class DBAdmin implements AdminServices {

	  DBManager  db = new DBManager(); 
	  
	
	 
	@Override
	public Admin findAdmin(int id) {
		db.connect();
		Admin admin = db.find(Admin.class, id); 
		db.close();
		return admin;  
	}



	@Override
	public Set<Admin> findAllAdmin() {		
		db.connect();
			HashSet<Admin> list = new HashSet<Admin>(db.selectAll(Admin.class));
		db.close();
		return list; 
	}

	@Override
	public void insertAdmin(Admin admin) {
		db.connect();
	    db.insert(admin);
	    db.close();
	}

	@Override
	public void remove(int id) {
	
		
	}
	
	
	


}

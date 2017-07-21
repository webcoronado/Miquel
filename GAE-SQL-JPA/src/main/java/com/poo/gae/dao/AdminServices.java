package com.poo.gae.dao;

import java.util.Set;

import model.Admin;

public interface AdminServices {
	
	public void insertAdmin(Admin admin); 
	public Admin findAdmin(int id); 
	public Set<Admin> findAllAdmin();
	public void remove(int id); 
	
}

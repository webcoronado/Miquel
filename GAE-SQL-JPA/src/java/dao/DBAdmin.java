package com.poo.gae.dao;

import java.util.HashSet;
import java.util.Set;

import model.Admin;
import model.Gallery;
import model.Item;

public class DBAdmin implements AdminServices {

	  DBManager  db = new DBManager(); 
	  
	
	 





	@Override
	public Set<Admin> getAllAdmin() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public void createAdmin(Admin admin) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void removeAdmin(Admin admin) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void updateAdmin(Admin admin) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Set<Gallery> getGalleries(int adminId){
		return null;
	
		
	
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	

	@Override
	public void createGallery(Admin admin, Gallery gallery) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void removeGallery(Gallery gallery) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void updateGallery(Gallery gallery) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public Set<Item> getItems(int galleryId) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public Set<Gallery> getgalleries(int adminId) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	


}

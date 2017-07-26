package com.poo.gae.dao;

import java.util.Set;


import model.Admin;
import model.Gallery;
import model.Item;

public interface AdminServices {
	public Set <Admin> getAllAdmin();
	public void createAdmin(Admin admin); 
	public void removeAdmin(Admin admin); 
	public void updateAdmin(Admin admin); 
	
	public void createGallery(Admin admin, Gallery gallery);
	public void removeGallery(Gallery gallery);
	public void updateGallery(Gallery gallery);
	
	
	public Set<Item> getItems(int galleryId);
	Set<Gallery> getgalleries(int adminId);
	Set<Gallery> getGalleries(int adminId);
	 
	
	
	
	
	
	
}

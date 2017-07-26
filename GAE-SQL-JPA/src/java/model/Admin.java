package model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity


public class Admin {
	
	@Id
	private int id;
	private String name;
	
	public Admin(int i, String string) {
		id = i; 
		name = string; 
	}
	public Admin() { 
		id = 0; 
		name = null; 
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	} 

}

package model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Item {
						
			@Id	
		
			private int id;
			private String name;
			private String description;
			private float price;
			
			public Item(int i, String string) {
				setId(i); 
				name = string; 
			}
			public void Admin() { 
				setId(0); 
				name = null; 
			}
			
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public String gedescription() {
				return description;
			}
			public void setDescription(String description) {
				this.description = description;
			}
			public float getPrice() {
				return price;
			}
			public void setPrice(float price) {
				this.price = price;
			}
			public int getId() {
				return id;
			}
			public void setId(int id) {
				this.id = id;
			}
		
			
			
			
			
			
			
			
			
		

	}
	
	



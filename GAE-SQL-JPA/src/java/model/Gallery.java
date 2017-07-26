package model;

	
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity


public class Gallery {

		@Id
	

		public class Admin {
		
	
	
		private int id;
		private String name;
		private String description;
		private String Admin;
		
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
		public String gedescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public String getAdmin() {
			return Admin;
		}
		public void setAdmin(String admin) {
			this.Admin = admin;
		}
	
		
		
		
		
		
		
		
		
	}

}

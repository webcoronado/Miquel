package model;



import java.sql.Date;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity


public class Comments {
	    
		@Id
		private int id; 
	    	private String user; 
		private String email;
		private String webpage; 
		

		private Date   datum;
		private String summary;
		private String comments;
		
		
	
		private String rate; 
		
		public Comments(){
			setId(-1); 
		}
		
	
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getWebpage() {
			return webpage;
		}
		public void dbManager(String webpage) {
			this.webpage = webpage;
		}
		public Date getDatum() {
			return datum;
		}
		public void setDatum(Date datum) {
			this.datum = datum;
		}
		public void setWebpage(String webpage) {
			this.webpage = webpage;
		}


		public String getSummary() {
			return summary;
		}
		public void setSummary(String summary) {
			this.summary = summary;
		}
		public String getComments() {
			return comments;
		}
		public void setComments(String comments) {
			this.comments = comments;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}


		public String getUser() {
			return user;
		}


		public void setUser(String user) {
			this.user = user;
		}


		public String getRate() {
			return rate;
		}


		public void setRate(String rate) {
			this.rate = rate;
		}
		
}

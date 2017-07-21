package com.poo.gae;

import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.persistence.EntityManager;

import org.junit.Assert;
import org.junit.Test;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

import com.poo.gae.dao.DBManager;

import model.Comments;



@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestDBConnection {


	@Test
	public void testInsert(){
		boolean result = true;
		DBManager dbManager =   new DBManager(); 		
		Comments comments1 =getMockComment(); 
		
		dbManager.connect();
		dbManager.insert(comments1);
		dbManager.close(); 	
		Assert.assertEquals(true,result);
		Assert.assertEquals(true,comments1.getId()!=-1); 
	}
	
		
	
	private Comments getMockComment() { 
		return getMockDBMComments("root", "root@root"); 
	}

	private Comments getMockDBMComments(String myUser, String email) { 
		Comments comments1 = new Comments();
		comments1.setUser(myUser);
		comments1.setEmail(email); 
		comments1.setSummary("Esto es un resumen"); 
		comments1.setComments("Esto es un comentario"); 
		comments1.setDatum(new Date(System.currentTimeMillis())); 
		comments1.setWebpage("poo.cifo"); 
		return comments1;
	}
	
	
	
	
	
	
	
}

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
public class TestDBMComments {


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
	
	
	@Test
	public void testGet(){
		
		DBManager dbManager =   new DBManager(); 		
		Comments comments1 =getMockComment(); 
		
		dbManager.connect();
		dbManager.insert(comments1);
		Comments results =  (Comments) dbManager.find(Comments.class,comments1.getId()); 
		dbManager.close(); 
	
		
		Assert.assertNotNull(results);
		Assert.assertEquals(true,comments1.getId()!=-1); 
	}
	
	
	@Test
	public void testUpdate(){
	
		DBManager dbManager =   new DBManager(); 		
		Comments comments1 =getMockComment(); 
		
		dbManager.connect();
		dbManager.insert(comments1);
		comments1.setUser("EditedUser"); 
		dbManager.update(comments1);
 		
		Comments results =  (Comments) dbManager.find(Comments.class,comments1.getId()); 
		dbManager.close(); 
	
		
		Assert.assertNotNull(results);
		Assert.assertEquals("EditedUser",results.getUser()); 
	}
	
	
	@Test
	public void testSelect(){
		boolean result = true;
		DBManager dbManager =   new DBManager();
		
		Comments comments1 =getMockDBMComments("user1","user1@poo.com");
		Comments comments2 =getMockDBMComments("user2","user2@poo.com");
		Comments comments3 =getMockDBMComments("user3","user3@poo.com");
		Comments comments4 =getMockDBMComments("user1","user4@poo.com");
		Comments comments5 =getMockDBMComments("xuser","user4@poo.com");
		
		ArrayList<Comments> results1 = null;  
		ArrayList<Comments> results2 = null;
		ArrayList<Comments> results3 = null;
		ArrayList<Comments> results4 = null;
		
		try {
			dbManager.connect(); 
			
			dbManager.deleteAll(Comments.class);
			
			dbManager.insert(comments1);
			dbManager.insert(comments2);
			dbManager.insert(comments3);
			dbManager.insert(comments4);
			dbManager.insert(comments5);
			
			results1 = dbManager.selectAll(Comments.class); 
			results2 = dbManager.selectLike(Comments.class, "user", "user"); 
			results3 = dbManager.selectBt(Comments.class,"id","BETWEEN 2 AND 5"); 
			results4 = dbManager.selectEqual(Comments.class, "user", "xuser");
			
		} catch (Exception e) {
			result = false; 
			e.printStackTrace();
		}finally{
			dbManager.close(); 
		}
		
		Assert.assertEquals(true,result);
		Assert.assertEquals(5,results1.size());
		Assert.assertEquals(4,results2.size());
		Assert.assertEquals(4,results3.size());
		Assert.assertEquals(1,results4.size());
	
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
	
	
	
	@Test
	public void testUpdateComment(){
	
		DBManager dbManager =   new DBManager(); 		
		Comments comments1 =getMockComment(); 
		
		dbManager.connect();
		
			EntityManager entityManager = dbManager.getEntityManager();
			entityManager.getTransaction().begin();
			    
				entityManager.persist(comments1); 
			
			entityManager.getTransaction().commit();
			
		dbManager.close(); 
		
			
		dbManager.insert(comments1);
		comments1.setUser("EditedUser"); 
		dbManager.update(comments1);
 		
		Comments results =  (Comments) dbManager.find(Comments.class,comments1.getId()); 
		dbManager.close(); 
	
		
		Assert.assertNotNull(results);
		Assert.assertEquals("EditedUser",results.getUser()); 
	}
	
	
	
	
	
	
	
}

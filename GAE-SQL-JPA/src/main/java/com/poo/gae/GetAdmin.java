/**
 * Copyright 2016 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.poo.gae;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.poo.gae.dao.DBAdmin;
import com.poo.gae.dao.DBManager;

import model.Admin;
import model.Comments;

public class GetAdmin extends HttpServlet {

  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;



	@Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) 
      throws IOException {
     	  
	// DBManager
	
	DBAdmin dbAdmin = new DBAdmin(); 
	Admin mock=new Admin(0,"AdminCreate");
	dbAdmin.insertAdmin(mock);
	
	response.setContentType("text/plain");
    response.getWriter().println("Admin:" + mock.getId());
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

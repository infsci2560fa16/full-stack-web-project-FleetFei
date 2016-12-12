/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myservelet;

/**
 *
 * @author fei
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Costomer_db;
import Entity.customer;

public class Register extends HttpServlet {
    	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
            String username = request.getParameter("name");
            String password = request.getParameter("password");
		
            List<Object> list = new ArrayList<Object>();
			
            list.add(username);
            list.add(password);
			
            new Costomer_db().addUser("Insert CUSTOMER(NAME,PASSWORD) values(?,?) ",list);

           
        }
        
        public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}
}

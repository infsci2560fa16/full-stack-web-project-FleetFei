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

public class Login extends HttpServlet {
    	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
            String username = request.getParameter("username");
            String password = request.getParameter("password");
			
            List<Object> list = new ArrayList<Object>();
			
            list.add(username);
            list.add(password);
			
            customer user = new Costomer_db().getUser("SELECT * FROM USER_TABLE WHERE USERNAME=? AND PASSWORD=?",list);

            if (user != null) {
                    System.out.println(user.getId());
                    
            } else {
                    request.setAttribute("message", "password wrong，please login again");
                    request.getRequestDispatcher("login.jsp").forward(request,
                                    response);
            }
        }
        
        public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}
}

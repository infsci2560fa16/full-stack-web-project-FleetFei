/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author fei
 */
import java.sql.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

import Entity.customer;

public class Costomer_db extends DB{
    public List<customer> getUserList(String sql, List<Object> params) {

		List<customer> lsu = new ArrayList<customer>();
              	try {
			if (conn.isClosed())
				conn = DriverManager.getConnection(url, user, password);
                                pstmt = conn.prepareStatement(sql);
                                if (params != null)
                                        for (int i = 0; i < params.size(); i++) {

                                            pstmt.setObject(i + 1, params.get(i));

                                        }

			rs = pstmt.executeQuery();

			while (rs.next()) {

				customer u = new customer();
				u.setId(rs.getInt("id"));
				u.setName(rs.getString("username"));
				u.setPassword(rs.getString("password"));
				lsu.add(u);
			}

		} catch (Exception e) {

			e.printStackTrace();
		} finally {
			close();
		}
		return lsu;
	}
	
	public customer getUser(String sql, List<Object> params) {
		customer u = null;
		List<customer> lsu = getUserList(sql, params);
		if (lsu != null && lsu.size() > 0)
			u = lsu.get(0);
		return u;
	}
        
        
        
        
        public void addUser(String sql, List<Object> params) {

		List<customer> lsu = new ArrayList<customer>();
              	try {
			if (conn.isClosed())
				conn = DriverManager.getConnection(url, user, password);
                                pstmt = conn.prepareStatement(sql);
                                if (params != null)
                                        for (int i = 0; i < params.size(); i++) {

                                            pstmt.setObject(i + 1, params.get(i));

                                        }

			pstmt.executeQuery();

			
		} catch (Exception e) {

			e.printStackTrace();
		} finally {
			close();
		}
		
	}
        
      
   
//    public static void main(String args[]) throws Exception{
//    
//        customerAction a=new customerAction();
//        customer g=new customer(100,"qifei","123");
//        a.addCustomer( g);
//    }
}

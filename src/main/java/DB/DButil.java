/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

/**
 *
 * @author fei
 */
public class DButil {
      
        private static final String URL="jdbc:derby://localhost:1527/webcoruse_project";
	private static final String USER="root";
	private static final String PASSWORD="root";
	
	private static Connection conn=null;
	
	static {
		try {
			//1.加载驱动程序
			 Class.forName("org.apache.derby.jdbc.ClientDriver");
			//2.获得数据库的连接
			conn=DriverManager.getConnection(URL, USER, PASSWORD);
                        Statement st1 = conn.createStatement();
//                        ResultSet rst=st1.executeQuery("select name from CUSTOMER");
//                        while(rst.next()){
//                         System.out.println(rst.getString("name"));
                        System.out.println("qifei---DButil");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection(){
		return conn;
	}
}

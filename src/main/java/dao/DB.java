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

import java.util.ArrayList;
import java.util.List;

public class DB {
    protected String driver = "org.apache.derby.jdbc.ClientDriver";

	protected String url = "jdbc:derby://localhost:1527/webcoruse_project";

	protected String user = "root";

	protected String password = "root";

	protected Connection conn = null;

	protected PreparedStatement pstmt = null;

	protected ResultSet rs = null;

	public DB() {

		try {

			Class.forName(driver);

			conn = DriverManager.getConnection(url, user, password);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	public int ExecuteSql (String sql, List<Object> params) {
		int result = 0;
		try {
			if (conn.isClosed())
				conn = DriverManager.getConnection(url, user, password);
			pstmt = conn.prepareStatement(sql);
			if (params != null)
				for (int i = 0; i < params.size(); i++) {

					pstmt.setObject(i + 1, params.get(i));

				}
			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return result;
	}

	public void close() {
		try {
			if (rs != null)
				rs.close();
			if (pstmt != null)
				pstmt.close();
			if (conn != null)
				conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

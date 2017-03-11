package com.myapp.struts;

import java.sql.*;

public class Conexion {
	private Connection conn;
	
	public Connection getConnection(){
		Connection conn=null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost/LoginDB", "root","root");
			
				
		}catch (ClassNotFoundException cnfe){
			cnfe.printStackTrace();
		}catch (SQLException sql){
			sql.printStackTrace();
		}
		return conn;
	}
	
	
}

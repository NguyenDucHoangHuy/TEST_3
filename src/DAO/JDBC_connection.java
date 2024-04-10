package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC_connection {
	public static Connection getConnection() throws SQLException{
		 Connection c= null;
		  
			  try {
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			  String url  = "jdbc:sqlserver://localhost:1433;databaseName=HOCSINH;encrypt=true;trustServerCertificate=true";
			    String user = "sa";
			    String pass = "hoanghuy111205";
			 c= DriverManager.getConnection(url,user,pass);
	    System.out.println("Ket noi thanh cong");
		 return c;
	 }
	 public static void closeConnection(Connection c) {
		 try {
			 if(c!=null) {
				 c.close();
				 System.out.println("Ngat ket noi");
			 }
		 } catch (Exception e) {
			 e.printStackTrace();
		 }
	 }
	  
	}


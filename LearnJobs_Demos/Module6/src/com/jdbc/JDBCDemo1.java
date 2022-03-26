package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCDemo1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		  Class.forName("com.mysql.cj.jdbc.Driver");
          // Setup the connection with the DB
          Connection con = DriverManager
                  .getConnection("jdbc:mysql://localhost/mysql?useSSL=false","root","mysql");
          
          System.out.println("Connection established !!");
                          
	}

}

package com.dbj.connection;


import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.jdbc.Connection;


public class Connect {

	public static  Connection  dbcon(String Driver,String Path,String U,String P) throws ClassNotFoundException, SQLException {
		
		
		Class.forName(Driver);
		Connection con=(Connection) DriverManager.getConnection(Path,U,P);
		
//		Class.forName("com.mysql.jdbc.Driver");
//		Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/resell","root","");
		
	return con;
}	
}


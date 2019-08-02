package com.dbj.connection;


import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;
import java.sql.*;
//import com.mysql.jdbc.Connection;


public class Connect {

	private final static Logger LOGGER =Logger.getLogger(Logger.GLOBAL_LOGGER_NAME); 

	public  static Connection con;
	
	public static  Connection  dbcon(String Driver,String Path,String U,String P) throws ClassNotFoundException, SQLException {
		
		
		Class.forName(Driver);
		con=(Connection) DriverManager.getConnection(Path,U,P);
		
		return con;
	
	}	
	
	public static  void  Setdbcon(String Driver,String Path,String U,String P) throws ClassNotFoundException, SQLException {
		
		
		Class.forName(Driver);
		con=(Connection) DriverManager.getConnection(Path,U,P);
		
	}	
}


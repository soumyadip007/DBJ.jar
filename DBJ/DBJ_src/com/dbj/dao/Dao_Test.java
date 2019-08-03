package com.dbj.dao;


import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.dbj.connection.Connect;
import com.dbj.query.Insert;

class Dao_Test {
	
	 private final static Logger LOGGER =Logger.getLogger(Logger.GLOBAL_LOGGER_NAME); 
		
	
	public static void main(String args[]){
	
		Connection con=(Connection) Connect.Getdbcon("com.mysql.jdbc.Driver","jdbc:mysql://localhost:3306/resell","root","");
	
		Connect.dbcon("com.mysql.jdbc.Driver","jdbc:mysql://localhost:3306/springcurd","root","");
		String[] l={"first_name", "last_name", "email"};
		Insert.Insert("customer",l,l);
		
	
	}
		
	}

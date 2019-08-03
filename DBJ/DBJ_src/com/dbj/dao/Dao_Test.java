package com.dbj.dao;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.dbj.connection.Connect;
import com.dbj.query.Insert;
import com.dbj.query.Select;

class Dao_Test {
	
	 private final static Logger LOGGER =Logger.getLogger(Logger.GLOBAL_LOGGER_NAME); 
		
	
	public static void main(String args[]){
	
		Connection con=(Connection) Connect.GetConnect("com.mysql.jdbc.Driver","jdbc:mysql://localhost:3306/resell","root","");
	
		Connect.Connect("com.mysql.jdbc.Driver","jdbc:mysql://localhost:3306/springcurd","root","");
	//	String[] index={"first_name", "last_name", "email"};
	//	String[] value={"Soumyadip", "Choudhury", "x@gmail.com"};
	//	Insert.Save("customer",index,value);
		ResultSet rs=Select.GetAll("customer");
		try {
			while(rs.next())
			{
				System.out.println(rs.getString(2));
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	
	}
		
	}

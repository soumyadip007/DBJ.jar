package com.dbj.test.driver;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.dbj.connection.Connect;
import com.dbj.query.Insert;
import com.dbj.query.Select;
/**
 * 
 * @author Soumyadip Chowdhury
 * @github soumyadip007
 *
 */
class Dao_Test {
	
	 private final static Logger LOGGER =Logger.getLogger(Logger.GLOBAL_LOGGER_NAME); 
		
	
	public static void main(String args[]){
	
	//	Connection con=(Connection) Connect.GetConnect("com.mysql.jdbc.Driver","jdbc:mysql://localhost:3306/resell","root","");
	//ResultSet rs=Select.Get(conn,"customer");
	//Insert.Save(con,"customer",index,value);
		
		
	//----------With out making a Connection object-----------------
		
		Connect.Connect("com.mysql.jdbc.Driver","jdbc:mysql://localhost:3306/springcurd","root","");
		String[] index={"first_name", "last_name", "email"};
		String[] value={"A", "Chowdhury", "gdgDevfest@gmail.com"};
		
		
		Insert.Save("customer",index,value);
		
		//ResultSet rs=Select.Get("customer");
		
		ResultSet rs=Select.Get("customer",index,value);
		try {
			while(rs.next())
			{
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(4));
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	
	}
		
	}

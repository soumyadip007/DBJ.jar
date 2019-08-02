package DBJ.Dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.dbj.connection.Connect;

class Dao {
	
	public static void main(String args[]){
	
		try {
			Connection con=(Connection) Connect.dbcon();
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
	
	
	}
		
	}

package com.dbj.query;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.dbj.connection.Connect;

public class Select {
	
	private final static Logger LOGGER =Logger.getLogger(Logger.GLOBAL_LOGGER_NAME); 
		
	public static ResultSet rs;
	
	public static ResultSet GetAll(String table)
	{
		
		LOGGER.log(Level.INFO,"Fetch from : "+table);
		
		String mainStmt="Select * from "+table;
		LOGGER.log(Level.INFO,"Query : "+mainStmt);
		try {
			PreparedStatement st=Connect.con.prepareStatement(mainStmt);
		

			rs=st.executeQuery();
			if(rs!=null)
			{
				LOGGER.log(Level.INFO, "Data Successfully retrived");
				return rs;
			}
			else
			{
				LOGGER.log(Level.INFO, "Database connection failed");
				return rs;
			}
			
		} catch (SQLException e) {
			
			LOGGER.log(Level.WARNING, "SQLException");
			e.printStackTrace();
		}		
		
		return rs;
	}
	
	public static ResultSet GetAll(Connection con,String table)
	{
		LOGGER.log(Level.INFO,"Fetch from : "+table);
		
		String mainStmt="Select * from "+table;
		LOGGER.log(Level.INFO,"Query : "+mainStmt);
		try {
			PreparedStatement st=con.prepareStatement(mainStmt);
		

			rs=st.executeQuery();
			if(rs!=null)
			{
				LOGGER.log(Level.INFO, "Data Successfully retrived");
				return rs;
			}
			else
			{
				LOGGER.log(Level.INFO, "Database connection failed");
				return rs;
			}
			
		} catch (SQLException e) {
			
			LOGGER.log(Level.WARNING, "SQLException");
			e.printStackTrace();
		}		
		
		
		
		return rs;
	}
	
	
	public static ResultSet Get(String table,String index,String value)
	{
		LOGGER.log(Level.INFO,"Fetch from : "+table);
		
		String mainStmt="Select * from "+table+" where "+index+"='"+value+"'";
		LOGGER.log(Level.INFO,"Query : "+mainStmt);
		try {
			PreparedStatement st=Connect.con.prepareStatement(mainStmt);
		

			rs=st.executeQuery();
			if(rs!=null)
			{
				LOGGER.log(Level.INFO, "Data Successfully retrived");
				return rs;
			}
			else
			{
				LOGGER.log(Level.INFO, "Database connection failed");
				return rs;
			}
			
		} catch (SQLException e) {
			
			LOGGER.log(Level.WARNING, "SQLException");
			e.printStackTrace();
		}		
		
		
		
		return rs;
	}
	
	public static ResultSet Get(Connection con,String table,String index,String value)
	{
		LOGGER.log(Level.INFO,"Fetch from : "+table);
		
		String mainStmt="Select * from "+table+" where "+index+"="+value;
		LOGGER.log(Level.INFO,"Query : "+mainStmt);
		try {
			PreparedStatement st=con.prepareStatement(mainStmt);
		

			rs=st.executeQuery();
			if(rs!=null)
			{
				LOGGER.log(Level.INFO, "Data Successfully retrived");
				return rs;
			}
			else
			{
				LOGGER.log(Level.INFO, "Database connection failed");
				return rs;
			}
			
		} catch (SQLException e) {
			
			LOGGER.log(Level.WARNING, "SQLException");
			e.printStackTrace();
		}		
	
		return rs;
	}
	
	public static ResultSet Search(String table,String index,String value)
	{
		LOGGER.log(Level.INFO,"Fetch from : "+table);
		
		String mainStmt="Select * from "+table+" where "+index+"='"+value+"'";
		LOGGER.log(Level.INFO,"Query : "+mainStmt);
		try {
			PreparedStatement st=Connect.con.prepareStatement(mainStmt);
		

			rs=st.executeQuery();
			if(rs!=null)
			{
				LOGGER.log(Level.INFO, "Data Successfully retrived");
				return rs;
			}
			else
			{
				LOGGER.log(Level.INFO, "Database connection failed");
				return rs;
			}
			
		} catch (SQLException e) {
			
			LOGGER.log(Level.WARNING, "SQLException");
			e.printStackTrace();
		}		
		
		
		
		return rs;
	}
	
	public static ResultSet Search(Connection con,String table,String index,String value)
	{
		LOGGER.log(Level.INFO,"Fetch from : "+table);
		
		String mainStmt="Select * from "+table+" where "+index+"="+value;
		LOGGER.log(Level.INFO,"Query : "+mainStmt);
		try {
			PreparedStatement st=con.prepareStatement(mainStmt);
		

			rs=st.executeQuery();
			if(rs!=null)
			{
				LOGGER.log(Level.INFO, "Data Successfully retrived");
				return rs;
			}
			else
			{
				LOGGER.log(Level.INFO, "Database connection failed");
				return rs;
			}
			
		} catch (SQLException e) {
			
			LOGGER.log(Level.WARNING, "SQLException");
			e.printStackTrace();
		}		
	
		return rs;
	}
	
	public static String genAnd(String[] index,String[] value)
	{
		String x="";
		int n=value.length,i=0;
		while(i<n)
		{
			
		}
		
	}

	public static ResultSet Get(String table,String[] index,String[] value)
	{
		LOGGER.log(Level.INFO,"Fetch from : "+table);
		
		String mainStmt="Select * from "+table+" where "+index+"='"+value+"'";
		
		
		LOGGER.log(Level.INFO,"Query : "+mainStmt);
		try {
			PreparedStatement st=Connect.con.prepareStatement(mainStmt);
		

			rs=st.executeQuery();
			if(rs!=null)
			{
				LOGGER.log(Level.INFO, "Data Successfully retrived");
				return rs;
			}
			else
			{
				LOGGER.log(Level.INFO, "Database connection failed");
				return rs;
			}
			
		} catch (SQLException e) {
			
			LOGGER.log(Level.WARNING, "SQLException");
			e.printStackTrace();
		}		
		
		
		
		return rs;
	}
	
	
}

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
		LOGGER.log(Level.INFO,"Executing Query : "+mainStmt);
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
		LOGGER.log(Level.INFO,"Executing Query : "+mainStmt);
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
		LOGGER.log(Level.INFO,"Fetching from : "+table);
		
		String mainStmt="Select * from "+table+" where "+index+"='"+value+"'";
		LOGGER.log(Level.INFO,"Executing Query : "+mainStmt);
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
		LOGGER.log(Level.INFO,"Fetching from : "+table);
		
		String mainStmt="Select * from "+table+" where "+index+"="+value;
		LOGGER.log(Level.INFO,"Executing Query : "+mainStmt);
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
		LOGGER.log(Level.INFO,"Fetching from : "+table);
		
		String mainStmt="Select * from "+table+" where "+index+"='"+value+"'";
		LOGGER.log(Level.INFO,"Executing Query : "+mainStmt);
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
		LOGGER.log(Level.INFO,"Fetching from : "+table);
		
		String mainStmt="Select * from "+table+" where "+index+"="+value;
		LOGGER.log(Level.INFO,"Executing Query : "+mainStmt);
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
		int n=value.length,i=0;
		String statement=index[0]+"='"+value[0]+"'";
		if(n==1)
			return statement;
		i=1;
		while(i<n)
		{
			statement=statement+" and "+index[i]+"='"+value[i]+"'";
			i++;
		}

		LOGGER.log(Level.INFO, "Where and query created :"+statement);
		
		return statement;
	}

	public static ResultSet Get(String table,String[] index,String[] value)
	{
		LOGGER.log(Level.INFO,"Fetching from : "+table);
		
		String mainStmt="Select * from "+table+" where "+genAnd(index,value);
		
		LOGGER.log(Level.INFO,"Executing Query : "+mainStmt);
		
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

	public static ResultSet Get(Connection con,String table,String[] index,String[] value)
	{
		LOGGER.log(Level.INFO,"Fetching from : "+table);
		
		String mainStmt="Select * from "+table+" where "+genAnd(index,value);
		
		LOGGER.log(Level.INFO,"Executing Query : "+mainStmt);
		
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
	

	public static ResultSet Search(String table,String[] index,String[] value)
	{
		LOGGER.log(Level.INFO,"Fetching from : "+table);
		
		String mainStmt="Select * from "+table+" where "+genAnd(index,value);
		
		LOGGER.log(Level.INFO,"Executing Query : "+mainStmt);
		
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

	public static ResultSet Search(Connection con,String table,String[] index,String[] value)
	{
		LOGGER.log(Level.INFO,"Fetching from : "+table);
		
		String mainStmt="Select * from "+table+" where "+genAnd(index,value);
		
		LOGGER.log(Level.INFO,"Executing Query : "+mainStmt);
		
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
}

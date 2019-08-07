package com.dbj.query;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.dbj.connection.Connect;

public class Insert {

	 private final static Logger LOGGER =Logger.getLogger(Logger.GLOBAL_LOGGER_NAME); 
	
	public static String ParamOpt(String[] param)
	{
		int n=param.length;
		String statement=param[0];
		if(n==1)
			return statement;
		
		int i=1;
		while(i<n)
		{
			statement=statement+","+param[i++];
		//	LOGGER.log(Level.INFO,"Configuring "+statement);
		}
		LOGGER.log(Level.INFO,statement);
		return statement;
	}


	public static String getMark(String[] value)
	{
		int n=value.length;
		LOGGER.log(Level.INFO, "Value size"+n);
		String res;
		if(n==1)
		{
			return "?";
		}
		
		int i=1;
		
		res="?";
		while(i<n)
		{
	//		LOGGER.log(Level.INFO,"Configuring "+res);
			res=res+","+"?";
			i++;
		}
		return res;
		
	}
	
	
	public static void Save(String table,String[] param,String[] value) {

		if(param.length!=value.length)
		{
			LOGGER.log(Level.INFO,"Mismatch with parameters and values\nexit(0)");
			return ;
		}
		
		String paramResult;
		LOGGER.log(Level.INFO, paramResult=ParamOpt(param));
		
		String valueResult;
		LOGGER.log(Level.INFO, valueResult=getMark(value));
		int n=value.length;
		
		
		
		String mainStmt="INSERT INTO "+table+"("+paramResult+") values("+valueResult+")";
		LOGGER.log(Level.INFO, mainStmt);
		
		try {
			PreparedStatement st=Connect.con.prepareStatement(mainStmt);
			int i=0;
			while(i<n)
			{
				LOGGER.log(Level.INFO, "Wrapping value: "+value[i]);
				st.setString((i+1), value[i]);
			i++;
			}

			int check=st.executeUpdate();
			if(check==1)
			{
				LOGGER.log(Level.INFO, "Data Successfully added");
			}
			else
			{
				LOGGER.log(Level.INFO, "Database connection failed");
			}
			
		} catch (SQLException e) {
			
			LOGGER.log(Level.WARNING, "SQLException");
			e.printStackTrace();
		}
		
		
		
		
	}
	
	
	public static void Save(Connection con,String table,String[] param,String[] value) {

		if(param.length!=value.length)
		{
			LOGGER.log(Level.INFO,"Mismatch with parameters and values\nexit(0)");
			return ;
		}
		
		String paramResult;
		LOGGER.log(Level.INFO, paramResult=ParamOpt(param));
		
		String valueResult;
		LOGGER.log(Level.INFO, valueResult=getMark(value));
		int n=value.length;
		
		
		
		String mainStmt="INSERT INTO "+table+"("+paramResult+") values("+valueResult+")";
		LOGGER.log(Level.INFO, mainStmt);
		
		try {
			PreparedStatement st=con.prepareStatement(mainStmt);
			int i=0;
			while(i<n)
			{
				LOGGER.log(Level.INFO, "Wrapping value: "+value[i]);
				st.setString((i+1), value[i]);
			i++;
			}

			int check=st.executeUpdate();
			if(check==1)
			{
				LOGGER.log(Level.INFO, "Data Successfully added");
			}
			else
			{
				LOGGER.log(Level.INFO, "Database connection failed");
			}
			
		} catch (SQLException e) {
			
			LOGGER.log(Level.WARNING, "SQLException");
			e.printStackTrace();
		}		
	}	

}

package com.dbj.query;

import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Insert {

	 private final static Logger LOGGER =Logger.getLogger(Logger.GLOBAL_LOGGER_NAME); 
	
	public static String ParamOpt(String[] param)
	{
		int n=param.length;
		String statement=param[0];
		int i=1;
		while(i<n)
		{
			statement=statement+","+param[i++];
		}
		return statement;
	}
	
	public static void Insert(Connection con,String account,String[] param,String[] value) {
		
		
	//	PreparedStatement pr=(PreparedStatement) con.prepareStatement("");
			
		
	}
	public static void main(String args[]) {
		
		
		String[] l={"Apple", "Banana", "Orange", "Grapes"};
		String x;
		LOGGER.log(Level.INFO, x=ParamOpt(l));
	}

}

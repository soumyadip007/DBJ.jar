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

	
	public static void Insert(Connection con,String table,String[] param,String[] value) {

		String paramResult;
		LOGGER.log(Level.INFO, paramResult=ParamOpt(param));
		
		
		
	}
	
	public static String getMark(String[] value)
	{
		int n=value.length;
		LOGGER.log(Level.INFO, n+"");
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
	
	
	public static void main(String args[]) {
		
		
	String[] l={"Apple", "Banana", "Orange", "Grapes"};
	String paramResult;
	LOGGER.log(Level.INFO, paramResult=ParamOpt(l));
	
	String a;
	LOGGER.log(Level.INFO, a=getMark(l));
	
	String mainStmt="INSERT INTO "+"customer"+"("+paramResult+") values("+ a+")";
	LOGGER.log(Level.INFO, mainStmt);
	}

}

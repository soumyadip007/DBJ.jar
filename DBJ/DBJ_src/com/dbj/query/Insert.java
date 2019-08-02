package com.dbj.query;

import java.sql.Connection;

import com.mysql.jdbc.PreparedStatement;

public class Insert {

	public static String ParamOpt(String[] param)
	{
		int n=param.length;
		String statement="";
		int i=0;
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
		
	}

}

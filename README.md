# DBJ.jar
A JAR file for replacement of native JDBC protocol ,which can connect to database with some Method, So user have to give the credentials and the parameter into the function ,DBJ will handle the rest part(Connection, Driver Manager, Prepared Statement, Resultset etc)


## Requirements

For building and running the application you need:

- [JDK 1.8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
- Database (MySql/Oracle/DB2)

##

# Connection Class (package com.dbj.connection)

- Set the connection object
```shell
	public static  void  Connect(String Driver,String Path,String Username,String Password) {
     	    ........
	}
```

- Get the connection object

```shell
	public static  Connection  Connect(String Driver,String Username,String Password {
      	   ........
    	  return connection;
	}
```

# Insert Class (package com.dbj.query)

```shell
	public static void Save(String table_name, String[] parameters, String[] value) {
      	   ........
    	 }
```

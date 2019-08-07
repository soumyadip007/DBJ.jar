# DBJ.jar
A JAR file for replacement of native JDBC protocol ,which can connect to database with some Method, So user have to give the credentials and the parameter into the function ,DBJ will handle the rest part(Connection, Driver Manager, Prepared Statement, Resultset etc)


## Requirements

For building and running the application you need:

- [JDK 1.8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
- Database (MySql/Oracle/DB2)
 
## Call the following methods (Static) and pass appropriate Parameter 
- Connection class (Set Universal Connection, Get Connection Object) @Overloading
- Insert Class (Save method with Connection object, Save method without Connection object)
- Select Class (GetAll with Connection object,GetAll without Connection object,Get specific field with/without Connection object)



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

```shell
	public static void Save(Connection con, String table_name, String[] parameters, String[] value) {
      	   ........
    	 }
```

# Select Class (package com.dbj.query)

```shell
	public static ResultSet GetAll(String table){
      	   ........
	   return resultSet;
    	 }
```


```shell
	public static ResultSet GetAll(Connection con,String table){
      	    ........
	   return resultSet;
    	 }
```


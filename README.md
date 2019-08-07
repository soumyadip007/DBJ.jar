# DBJ.jar
A JAR file for replacement of native JDBC protocol ,which can connect to database by just calling some Methods, So user just have to give the credentials and the parameter into the function ,DBJ will handle the rest part(Connection, Driver Manager, Prepared Statement, Resultset etc. )


## Requirements

For building and running the application you need:

- [JDK 1.8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) or above
- Database (MySql/Oracle/DB2/MySql Server) [MySql is preferable]
 
## Call the following methods (Static) and pass appropriate parameters 
- Connection class (Set Universal Connection, Get Connection Object) @Overloading
- Insert Class (Save method with Connection object, Save method without Connection object)  @Overloading
- Select Class (GetAll with Connection object,GetAll without Connection object,Get specific field with/without Connection object)  @Overloading
- Update Class (Yet to implement)
- Delete Class (Yet to implement)
- Trigger Class (Yet to implement)
- Cascading Rollback for Transaction (Yet to implement)

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

- Save the attributes (Don't pass connection object) 
```shell
	public static void Save(String table_name, String[] parameters, String[] value) {
      	   ........
    	 }
```
- Save the attributes (Pass connection object) 
```shell
	public static void Save(Connection con, String table_name, String[] parameters, String[] value) {
      	   ........
    	 }
```

# Select Class (package com.dbj.query)

- Get all attributes from the table (Don't pass connection object) 
```shell
	public static ResultSet GetAll(String table){
      	   ........
	   return resultSet;
    	 }
```

- Get all attributes from the table (Pass connection object) 
```shell
	public static ResultSet GetAll(Connection con,String table){
      	    ........
	   return resultSet;
    	 }
```

- Get some specific attribute from the table (Don't pass connection object) 
```shell
	public static ResultSet Get(String table,String index,String value){
      	    ........
	   return resultSet;
    	 }
```

- Get some specific attribute from the table (Pass connection object) 
```shell
	public static ResultSet Get(Connection con,String table,String index,String value){
      	    ........
	   return resultSet;
    	 }
```

- [Jira Deployment](https://issues.sonatype.org/browse/OSSRH-50506?focusedCommentId=770829&page=com.atlassian.jira.plugin.system.issuetabpanels%3Acomment-tabpanel#comment-770829)

# Released
- Jar file
# Yet to release
- Maven (POM.XML)
- Gradle
- SBT
- Ivy
- Grape
- Leiningen
- Buildr


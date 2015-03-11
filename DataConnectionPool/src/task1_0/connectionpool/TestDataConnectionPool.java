/*DCP is the in memory cache of database connection objects. Connection is reused by multiple users. 

Applications using databases often need to create connections to the database frequently for user requests. One of the 
most expensive tasks is the initial creation of the connection. Once the connection has been made the transaction often 
takes place very quickly. 

Create Database Connection Pool using 

1. Using C3p0 Library in Desktop and Web Application

It is very easy to configure and need two jars to be in CLASSPATH to use it. 
1.	c3p0-0.9.2.1.jar
2.	mchange-commons-java-0.2.3.4.jar*/

package task1_0.connectionpool;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


public class TestDataConnectionPool {
	public static void main(String[] args) throws Exception {

		// Instantiate object of Database Connection Pool

		ComboPooledDataSource cpds = new ComboPooledDataSource();

		// Set JDBC Driver name
		cpds.setDriverClass("com.mysql.jdbc.Driver");

		// Set Database URL
		cpds.setJdbcUrl("jdbc:mysql://localhost:3306/praful");

		// Set Database URL
		cpds.setUser("root");

		// Set Database Password
		cpds.setPassword("root");

		// Optional Parameters

		// Minimum number of connections in pool
		cpds.setMinPoolSize(10);
		// Increase connections if pool is exhausted
		cpds.setAcquireIncrement(10);
		// Set Maximum Pool Size
		cpds.setMaxPoolSize(100);
		// Initial Pool Size
		cpds.setInitialPoolSize(10);

		// DataSource is now ready to use

		// Get a connection from connection pool
		Connection con = cpds.getConnection();

		// Create statement and execute query
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM studentdto");

		while (rs.next()) {
			System.out.println(rs.getString(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
			System.out.println(rs.getString(4));
			System.out.println(rs.getString(5));
		}

		stmt.close();

		// Return connection to pool
		con.close();
	}
}

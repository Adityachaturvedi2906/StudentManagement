package javaConnectorProj2;

import java.sql.Connection;
import java.sql.DriverManager;


public class ConnectionClass {

	static Connection con;
	public static Connection connect() throws Exception
	{
		
		Class.forName("com.mysql.cj.jdbc.Driver");		//Driver registered
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Student_Management", "root", "742529");
		
		return con;
		
	}
}

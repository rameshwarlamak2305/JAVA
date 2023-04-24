package jdbclab;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC {
	
	static private String url="jdbc:mysql://localhost:3306/mydatabase";
	 static  private String user="root";
	 static  private String pass="Pass@121";
	  
	  public static Connection getConn() throws SQLException {
		
			Connection con=DriverManager.getConnection(url,user,pass);
		
		
		return con;  
	  }

}

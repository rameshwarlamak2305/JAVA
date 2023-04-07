package jdbcFirstProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App1 {

	public static void main(String[] args) {
		
		
		try {
			try {
				//step 1: optional
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			// step2
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root","Pass@121" );
			//step3
			//creating object of statement interface
			Statement statement=con.createStatement();
			
			//step4
			ResultSet rs = statement.executeQuery("SELECT * FROM EMP");
			//step 5
			while(rs.next()) {
				System.out.println(rs.getString(1)+"\t" +rs.getString(2));
			}
			
			con.close();
			
			System.out.println(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

package jdbcFirstProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertValues {

	public static void main(String[] args) {
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root","Pass@121");
			Statement st=con.createStatement();
			String query="insert into jdbc values('mahesh',1001)";
			int result=st.executeUpdate(query);
			
			if(result>=1) {
				System.out.println("done");
			}else {
				System.out.println("not done");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

package jdbcFirstProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) {
		Connection con;
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root","Pass@121");
			
			Statement st=con.createStatement();
			String query="create table jdbc(name varchar(20),roll_number int)";
			boolean result =st.execute(query);
			
			if(!result) {
				System.out.println("done");
			} else {
				System.out.println("not done");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

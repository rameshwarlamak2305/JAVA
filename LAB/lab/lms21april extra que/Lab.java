package jdbclab;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Lab {
	public static void main(String[] args) {
		Connection con;
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root","Pass@121");
			
			Statement st=con.createStatement();
			
			String query="create table department(dept_id int primary key,dept_name varchar(30),dept_head varchar(30),dept_desc varchar(30))";
			boolean b = st.execute(query);
			if(!b) {
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

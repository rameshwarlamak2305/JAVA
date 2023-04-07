package jdbcFirstProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class App {

	public static void main(String[] args) {
		try {
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","Pass@121");
			System.out.println(c);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

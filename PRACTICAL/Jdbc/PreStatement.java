package jdbcFirstProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.UpdateStatement;

public class PreStatement {

	public static void main(String[] args) {
		int start=1,end=5;
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root","Pass@121");
		UpdateStatement ps=con.prepareStatement("select emp_id,emp_name from emp where emp_id>=? and emp_id<=?");
		 	ps.setInt(1,start);
		 	ps.setInt(2,end);
		 	
		 	ResultSet rs= ps.executeQuery();
		 	while(rs.next()) {
		 		System.out.println(rs.getInt(1) + "\t" + rs.getString(2));
		 		
		 	}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

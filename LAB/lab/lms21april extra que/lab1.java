package jdbclab;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class lab1 {
	public static void main(String[] args) {
		
		
		Connection con;
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root","Pass@121");
			
			Statement st=con.createStatement();
			String query="CREATE TABLE Employee_dept (\r\n"
					+ "  Employee_Id INT PRIMARY KEY,\r\n"
					+ "  Employee_Name VARCHAR(50),\r\n"
					+ "  Employee_Address VARCHAR(100),\r\n"
					+ "  Employee_Salary DECIMAL(10, 2),\r\n"
					+ "  Employee_Contact_No VARCHAR(15),\r\n"
					+ "  dept_id INT,\r\n"
					+ "  CONSTRAINT fk_dept_id FOREIGN KEY (dept_id) REFERENCES Department(dept_id),\r\n"
					+ "  CONSTRAINT chk_salary CHECK (Employee_Salary BETWEEN 1000 AND 1000000)\r\n"
					+ ")";
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

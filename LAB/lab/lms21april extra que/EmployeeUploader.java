package jdbclab;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jdbclab.JDBC;

public class EmployeeUploader {

	static Connection c = null;
	static PreparedStatement smpt = null;

	public static void insertRecord(int dept_id, String dept_name, String dept_head, String dept_desc) {
		try {
			c = JDBC.getConn();
			smpt = c.prepareStatement("insert into department values(?,?,?,?)");
			smpt.setInt(1, dept_id);
			smpt.setString(2, dept_name);
			smpt.setString(3, dept_head);
			smpt.setString(4, dept_desc);

			int rows = smpt.executeUpdate();
			if (rows > 0)
				System.out.println("record added");
			else
				System.out.println("not added");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (c != null || smpt != null)
					c.close();
				smpt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void insertRecord1(int emp_id, String emp_name, String emp_address, double emp_salary,
			String emp_contact, int dept_id) {
		try {
			c = JDBC.getConn();
			smpt = c.prepareStatement("insert into employee_dept values(?,?,?,?,?,?)");
			smpt.setInt(1, emp_id);
			smpt.setString(2, emp_name);
			smpt.setString(3, emp_address);
			smpt.setDouble(4, emp_salary);
			smpt.setString(5, emp_contact);
			smpt.setInt(6, dept_id);

			int rows = smpt.executeUpdate();
			if (rows > 0)
				System.out.println("record added");
			else
				System.out.println("not added");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (c != null || smpt != null)
					c.close();
				smpt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	
	
	public static void retrieveData(int emp_id ) {
		try {
			c = JDBC.getConn();

			smpt = c.prepareStatement("SELECT * FROM Employee_dept where employee_id = ?");
			smpt.setInt(1, emp_id);
			
			ResultSet res = smpt.executeQuery();
			while (res.next()) {
				System.out.println(
						res.getInt(1) + "\t" + res.getString(2) + "\t" + res.getString(3) + "\t" + res.getDouble(4) + "\t" + res.getString(5) + "\t" + res.getInt(6) );
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}

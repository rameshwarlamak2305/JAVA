package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import dao.JDBC;

public class Employee {
	
	 
	static Connection c=null;
	static Statement s=null;
	public static void createTable() {
		try {
			 c= JDBC.getConn();
			 s=c.createStatement();
			
			boolean result = s.execute("create table employee(emp_id int primary key auto_increment,emp_name varchar(20))");
			
			if(!result) {
				System.out.println("done");
				
			}
			else {
				System.out.println("not done");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		finally {
			try {
				if(c!=null || s!=null)
				c.close();
				s.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	 static PreparedStatement smpt=null;
	public static void insertRecord(int emp_id,String emp_name) {
		try {
			 c=JDBC.getConn();
			  smpt = c.prepareStatement("insert into employee values(?,?)");
			 smpt.setInt(1, emp_id);
			 smpt.setString(2,emp_name);
			 
			int rows= smpt.executeUpdate();
			if(rows>0)
				System.out.println("record added");
			else
				System.out.println("not added");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				if(c!=null || smpt !=null)
				c.close();
				smpt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
		
			   
		}
	   public static void updateRecord( String emp_name ,int emp_id) {
		   try {
			c=JDBC.getConn();
			
			smpt=c.prepareStatement("update employee set emp_name=? where emp_id=?");
			smpt.setString(1, emp_name);
			smpt.setInt(2, emp_id);
			int result = smpt.executeUpdate();
			if(result>=1) {
				System.out.println("Update");
			}else {
				System.out.println("not Update");
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   }
	
	public static void retrieveData(int emp_id ) {
		try {
			c = JDBC.getConn();

			smpt = c.prepareStatement("SELECT * FROM Employee where emp_id = ?");
			smpt.setInt(1, emp_id);
			
			ResultSet res = smpt.executeQuery();
			while (res.next()) {
				System.out.println(
						res.getInt(1) + "\t" + res.getString(2));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	public static void deleteRecord( int emp_id) {
		try {
			c=JDBC.getConn();
			
		smpt=c.prepareStatement("delete from employee where emp_id=?");
		smpt.setInt(1, emp_id);
		int res = smpt.executeUpdate();
		if(res>=1) {
			System.out.println("deleted");
			
		}
		else {
			System.out.println("not deleted");
		}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	 public static void showAll() {
		 try {
			c=JDBC.getConn();
			
			smpt=c.prepareStatement("select * from employee");
			ResultSet rs = smpt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	 public static void admin(String username,String pass) {
		 try {
			c=JDBC.getConn();
			smpt=c.prepareStatement("select * from admin");
			ResultSet rs = smpt.executeQuery();
			while(rs.next()) {
				if (rs.getString(1).equals(username) && rs.getString(2).equals(pass)) {
				System.out.println("password matched");
				Crud.app();
					
				}else {
					System.out.println("Password dosent match");
					
				}
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
		

	

	

	
}

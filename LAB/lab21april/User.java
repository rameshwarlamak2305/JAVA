package newlab;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import jdbclab.JDBC;

public class User {

	static Connection c = null;
	static Statement s = null;

	public static void createTable() {
		try {
			c = JDBC.getConn();
			s = c.createStatement();

			boolean result = s
					.execute("create table users(user_id int,user_name varchar(20) primary key,user_pass varchar(30))");

			if (!result) {
				System.out.println("done");

			} else {
				System.out.println("not done");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (c != null || s != null)
					c.close();
				s.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

	static PreparedStatement smpt = null;

	public static void insertRecord(int user_id, String user_name, String user_pass) {
		try {
			c = JDBC.getConn();
			smpt = c.prepareStatement("insert into Users values(?,?,?)");
			smpt.setInt(1, user_id);
			smpt.setString(2, user_name);
			smpt.setString(3, user_pass);

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

	public static void updateRecord(String user_pass, String user_name) {
		try {
			c = JDBC.getConn();

			smpt = c.prepareStatement("update Users set user_pass=? where user_pass=?");
			smpt.setString(1, user_pass);
			smpt.setString(2, user_name);
			int result = smpt.executeUpdate();
			if (result > 1) {
				System.out.println("Update");
			} else {
				System.out.println("not Update");

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void retrieveData(int user_id) {
		try {
			c = JDBC.getConn();

			smpt = c.prepareStatement("SELECT * FROM users where user_id = ?");
			smpt.setInt(1, user_id);

			ResultSet res = smpt.executeQuery();
			while (res.next()) {
				System.out.println(res.getInt(1) + "\t" + res.getString(2) + "\t" + res.getString(3));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void deleteRecord(int user_id) {
		try {
			c = JDBC.getConn();

			smpt = c.prepareStatement("delete from users where user_id=?");
			smpt.setInt(1, user_id);
			int res = smpt.executeUpdate();
			if (res >= 1) {
				System.out.println("deleted");

			} else {
				System.out.println("not deleted");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void showAll() {
		try {
			c = JDBC.getConn();

			smpt = c.prepareStatement("select * from Users");
			ResultSet rs = smpt.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

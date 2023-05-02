package Spring.SpringJdbc.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import Spring.SpringJdbc.model.User;

public class ServiceImp implements Service {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	public ServiceImp(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate=jdbcTemplate;
	}

	
	
	
	public ServiceImp() {
		
	}
	@Override
	public void insertRecord(User user) {

		int userId = user.getUserId();
		String userName = user.getUserName();
		String userPass = user.getUserPass();

		String q = "insert into users values (?,?,?)";

		Object[] arr = { userId, userName, userPass };
		int row = jdbcTemplate.update(q, arr);

		if (row > 0) {
			System.out.println("inserted");
		} else {
			System.out.println("not inserted");
		}

	}

	public DataSource getDataSource() {
		DataSource ds = new DriverManagerDataSource("jdbc:mysql://localhost:3306/mydatabase", "root", "Pass@121");
		return ds;
	}
}

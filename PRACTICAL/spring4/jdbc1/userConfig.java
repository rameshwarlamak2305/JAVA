package Spring.SpringJdbc.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import Spring.SpringJdbc.dao.ServiceImp;

@Configuration
@ComponentScan(basePackages="Spring.SpringJdbc")
public class userConfig {
	@Bean
	public DataSource getDataSource() {
		DataSource dt=new DriverManagerDataSource("jdbc:mysql://localhost:3306/mydatabase", "root", "Pass@121");
		return dt;
	}
	@Bean
	public JdbcTemplate jdbcTemplate() {
		JdbcTemplate jdbcTemplate=new JdbcTemplate(getDataSource());
		return jdbcTemplate;
	}
	@Bean("users")
	public ServiceImp serviceImp() {
		ServiceImp serviceImp=new ServiceImp(jdbcTemplate());
		return serviceImp;
	}

}

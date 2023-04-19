package hiber3nate.gibernate3rdProject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import dao.Services;
import model.Customer;

public class App {
	public static void main(String[] args) {
		Configuration con = new Configuration();
		con.configure();
		Session sf = con.buildSessionFactory().openSession();
		Transaction transaction = sf.beginTransaction();
		System.out.println("project started");

		String date = "2023/02/15";
		SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd");
		try {
			Date doj = df.parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		  Customer c1 = new Customer();
		  
		  c1.setCust_name("himanshu"); c1.setPassword("1231"); c1.setDoj(doj);
		 
		  Customer c2 = new Customer();
		 
		 c2.setCust_name("hemanshu"); c2.setPassword("12312"); c2.setDoj(doj);
		  
		  Customer c3 = new Customer();
		  
		  c3.setCust_name("hrushabh"); c3.setPassword("12316"); c3.setDoj(doj);
		  
		  sf.save(c1); sf.save(c2); sf.save(c3);
		  
		  transaction.commit(); }
		 

		/*Customer c = new Customer(4, "ram", "1434", new Date());
		Services.addnewRecord(c);
		Customer c1 = new Customer(2, "shyam", "12434", new Date());
		Services.addnewRecord(c1);
		//Customer c2 = new Customer(3, "mahesh", "135", new Date());
		//Services.addnewRecord(c2);
		//Services.deleteRecord(5);*/

	
}



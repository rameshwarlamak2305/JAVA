package Hibernet.HibernetFirstProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		Configuration conf = new Configuration();
		conf.configure("hibernate.cfg.xml");

		SessionFactory sf = conf.buildSessionFactory();

		Session session = sf.openSession();
		Object object = session.get("Hibernet.HibernetFirstProject.Employee",4);
		
		System.out.println(object);
		 
		
		Transaction transaction = session.beginTransaction();
		
		
		//Employee e=new Employee(7, "xyz");
		
		//session.save(e);
		
		//Employee e1= session.get(Employee.class, 3);
		
		//session.delete(e1);
		Employee e2=new Employee(2, "pqr");
		
		session.update(e2);
		
		transaction.commit();
		
		

	}
}

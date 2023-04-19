package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Customer;

public class Services {

	public static Session getSession() {
		Configuration con = new Configuration().configure();
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		//Transaction tr = session.beginTransaction();
		//tr.commit();
		return session;

	}

	public static void addnewRecord(Customer cust) {
		Session session = getSession();
		session.save(cust);
		session.beginTransaction().commit();
	}

	public static void deleteRecord(int id) {
		Session session = getSession();
		session.save(id);
		System.out.println("record deleted");
	}

}

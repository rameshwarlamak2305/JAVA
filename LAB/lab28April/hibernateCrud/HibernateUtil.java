package hibernateUtil;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	public static Session getSession() {
		Configuration con = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf = con.buildSessionFactory();

		Session session = sf.openSession();

		return session;
	}

}

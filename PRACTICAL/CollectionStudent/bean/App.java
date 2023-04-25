package Spring.Spring2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		/*
		 * ApplicationContext apc=new ClassPathXmlApplicationContext("c.xml"); Student
		 * s=apc.getBean("s1",Student.class); System.out.println(s);
		 */
	//	Student s2=apc.getBean("s2",Student.class);
		//System.out.println(s2);
		
		ApplicationContext apc=new ClassPathXmlApplicationContext("c.xml");
		 Student s1=apc.getBean("student1",Student.class);
		System.out.println(s1);
	}

}

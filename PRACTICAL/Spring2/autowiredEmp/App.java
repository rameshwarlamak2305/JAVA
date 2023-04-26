package Spring.EmpSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext apc=new ClassPathXmlApplicationContext("cfg.xml");
		 Employee e1=apc.getBean("emp",Employee.class);
		e1.showEmployee();
    	
    	
		/*
		 * ApplicationContext apc=new ClassPathXmlApplicationContext("cfg.xml"); Mobile
		 * mobileObj=apc.getBean("mob",Mobile.class); mobileObj.showMobile();
		 */
    }
}

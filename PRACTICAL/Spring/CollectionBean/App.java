package Spring.EmpSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App 
{
    public static void main( String[] args )
    {
    	/*ApplicationContext apc=new ClassPathXmlApplicationContext("cfg.xml");
		 Employee e1=apc.getBean("emp",Employee.class);
		System.out.println(e1);*/
    	
    	
    	ApplicationContext apc=new ClassPathXmlApplicationContext("cfg.xml");
    	Mobile mobileObj=apc.getBean("mob",Mobile.class);
    	System.out.println(mobileObj);
    	
    }
}

package Spring.SpringProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	//Vodaphone vp=new Vodaphone();
    	//vp.call();
    	//vp.internate();
    	
    	
    	
        ApplicationContext apc= new ClassPathXmlApplicationContext("Config.xml");
        
        Sim ob=apc.getBean("xyz",Sim.class);
        ob.call();
        ob.internate();
        Sim ab=apc.getBean("abc",Sim.class);
        ab.call();
        ab.internate();
        
    }
}

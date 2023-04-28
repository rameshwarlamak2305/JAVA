package com.springcore.SpringWithout;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext apc=new AnnotationConfigApplicationContext(SpringConfig.class);
       School sch= apc.getBean("school",School.class);
       System.out.println(sch);
       sch.call();
       
       Principal prl=apc.getBean("principal",Principal.class);
       System.out.println(prl);
       
       MathTeacher m1=apc.getBean("xyz",MathTeacher.class);
       System.out.println(m1);
       ((AnnotationConfigApplicationContext)apc).close();
    }
}

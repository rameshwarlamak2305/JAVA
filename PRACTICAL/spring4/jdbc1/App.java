package Spring.SpringJdbc;

import Spring.SpringJdbc.dao.Service;
import Spring.SpringJdbc.dao.ServiceImp;
import Spring.SpringJdbc.model.User;

public class App 
{
    public static void main( String[] args )
    {
    	 User user1=new User();
         user1.setUserId(100);
         user1.setUserName("abcde");
         user1.setUserPass("123");
         Service service=new ServiceImp();
         service.insertRecord(user1);
    }
}

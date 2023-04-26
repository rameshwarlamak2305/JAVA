package Spring.EmpSpring;

import lombok.Data;

@Data
public class Sim {
	
	/*
	 * private String simNumber; private String number;
	 */
   public void call() {
	   System.out.println("ready to call");
   }
   public  void internet() {
	   System.out.println("ready to use internet");
   }
}

package Spring.EmpSpring;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
public class Employee {

	//primitive type
	
	 
	  private int empId;
	  private String empname;
	  private String empSalary;
	  //collection
	  
		/*
		 * private List<String> empMobile; private Set<String> empaddress; private
		 * Map<String, String> deptDetails;
		 */
	  @Autowired
	  private Customer ram;
	  public void showEmployee() {
	  	System.out.println("empid :"+this.empId);
	  	System.out.println("empname :"+this.empname);
	  	System.out.println("empSalary :"+this.empSalary);
	  	
	  	
	  	if(ram!=null) {
	  		ram.id();
	  		ram.purchase();
	  	}
	  	else {
	  		System.out.println("not purchased");
	  	}
	  	
	  }
	}



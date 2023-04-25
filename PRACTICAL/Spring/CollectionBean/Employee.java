package Spring.EmpSpring;

import java.util.List;
import java.util.Map;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Employee {

	//primitive type
	
	 
	  private int empId;
	  private String empname;
	  private String empSalary;
	  //collection
	  
	 private List<String> empMobile;
	 private Set<String> empaddress;
	 private Map<String, String> deptDetails;
		

	}



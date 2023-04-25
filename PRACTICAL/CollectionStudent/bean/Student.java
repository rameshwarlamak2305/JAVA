package Spring.Spring2;

import java.util.List;
import java.util.Map;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class Student {
 //primitive type
	
 
  private int rollNumber;
  private String name;
  //collection
  
 private List<String> mobile;
 private Set<String> address;
 private Map<String, String> course;

  


}

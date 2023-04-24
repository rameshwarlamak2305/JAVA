package Spring.Spring2;

public class Student {
  
 private String name;
  private int rollNumber;
  

  

public Student(String name, int rollNumber) {
	super();
	this.name = name;
	this.rollNumber = rollNumber;
}




@Override
public String toString() {
	return "Student [name=" + name + ", rollNumber=" + rollNumber + "]";
}
  
}

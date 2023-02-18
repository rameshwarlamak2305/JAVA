// parent class Employee
class Employee {
	//local variable 
  long employeeId;
  String employeeName;
  String employeeAddress;
  long employeePhone;
  double basicSalary;
  double specialAllowance = 250.80;
  double hra = 1000.50;

//constructor of Employee class
  Employee(long id, String name, String address, long phone, double salary) {
    this.employeeId = id;
    this.employeeName = name;
    this.employeeAddress = address;
    this.employeePhone = phone;
    this.basicSalary = salary;
  }

//salary method
  void calculateSalary() {
    double salary = basicSalary + (basicSalary * specialAllowance / 100) + (basicSalary * hra / 100);
    System.out.println("Salary: " + salary);
  }

//Allowence method
  void calculateTransportAllowance() {
    double transportAllowance = 10 * basicSalary / 100;
    System.out.println("Transport Allowance: " + transportAllowance);
  }
}

//Manager class inherited from parent class Employee
class Manager extends Employee {
  Manager(long id, String name, String address, long phone, double salary) {
    super(id, name, address, phone, salary);//Super keyword Defines the Parent reference
  }

  //Overriding the Allowencw method
  void calculateTransportAllowance() {
    double transportAllowance = 15 * basicSalary / 100;
    System.out.println("Transport Allowance: " + transportAllowance);
  }
}


//another child class of Emlpoyee
class Trainee extends Employee {
  Trainee(long id, String name, String address, long phone, double salary) {
    super(id, name, address, phone, salary);
  }
}

class InheritanceActivity1 {
  public static void main(String[] args) {

	  //creating manager obeject and Parameterised constructor
    Manager manager = new Manager(126534, "Peter", "Chennai India", 237844, 65000);
    System.out.println("Manager Details:");
    System.out.println("ID: " + manager.employeeId);
    System.out.println("Name: " + manager.employeeName);
    System.out.println("Address: " + manager.employeeAddress);
    System.out.println("Phone: " + manager.employeePhone);
    System.out.println("Basic Salary: " + manager.basicSalary);
    manager.calculateSalary();
    manager.calculateTransportAllowance();//method call

    System.out.println();


    //Creating trainee object and parameterised constructor
    Trainee trainee = new Trainee(29846, "Jack", "Mumbai India", 442085, 45000);
    System.out.println("Trainee Details:");
    System.out.println("ID: " + trainee.employeeId);
    System.out.println("Name: " + trainee.employeeName);
    System.out.println("Address: " + trainee.employeeAddress);
    System.out.println("Phone: " + trainee.employeePhone);
    System.out.println("Basic Salary: " + trainee.basicSalary);
    trainee.calculateSalary();
    trainee.calculateTransportAllowance();//method call
  }
}
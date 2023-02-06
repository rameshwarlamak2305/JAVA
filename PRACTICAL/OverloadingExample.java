class OverloadingExample{

	public void sum(int a, int b) {
    System.out.println("Sum of two integers: " + (a + b));
  }
  
  public void sum(int a, int b, int c) {
    System.out.println("Sum of three integers: " + (a + b + c));
  }
  
  public void sum(double a, double b) {
    System.out.println("Sum of two doubles: " + (a + b));
  }

  public static void main(String[] args) {
    OverloadingExample obj = new OverloadingExample();
    obj.sum(10, 20);
    obj.sum(10, 20, 30);
    obj.sum(10.5, 20.5);
  }
  
  
}


 

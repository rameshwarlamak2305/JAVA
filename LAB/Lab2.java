//import java.util.Scanner;
class Lab2{
	public void number(){
	int count = 0;
 for (int i = 1; i <100; i++)
 {
	 if(i>40)
	 {
     if(i% 5 == 0)
     {
         System.out.println("number are" +i );
         count++;
     }
 }
 }
	
 
 
 }
	public static void main(String args[])
 {
		//Scanner a=new Scanner(System.in);
		//System.out.println("enter a num");
		//int num=a.nextInt();
		Lab2 obj=new Lab2();
		obj.number();
 }
}
  
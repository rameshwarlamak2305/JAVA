import java.util.Scanner;
class UseDelimeter{

 public static void main(String[] args){
	// String s= "Ram is coder";
	 Scanner sc=new Scanner("Ram is coder");
	// System.out.println("string s:"+sc.nextline());
	 sc.useDelimiter("is");
	 while(sc.hasNext())
	 {
		 System.out.println(sc.next());
	 }
	 Scanner s=new Scanner("Ram /is coder");
	
	 s.useDelimiter("/");
	 while(s.hasNext())
	 {
		 System.out.println(s.next());
	 }
 }
}
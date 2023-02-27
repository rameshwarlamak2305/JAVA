package practical;
import java.util.Scanner;
public class StringPractical {




	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter First String: ");
		String a=sc.next();
		System.out.println("Enter Second String: ");
		String b=sc.next();
		
		System.out.println("Sum of Length of "+a+" and "+b+" : "+(a.length()+b.length()));
		if(a.compareTo(b)<0)
		{
			System.out.println("Yes "+a+" comes before "+b);
			
		}
		else {
			System.out.println("NO "+a+" doest not comes before "+b);
		}
		System.out.println(a.substring(0,1).toUpperCase()+a.substring(1)+" "+b.substring(0,1).toUpperCase()+b.substring(1));

	}

}
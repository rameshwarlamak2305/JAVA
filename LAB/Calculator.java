// program for calculator
import java.util.Scanner;
class Calculator
{
	public static void main(String args[])
    	{
	int num1,num2,result=0;
	
	 Scanner sc = new Scanner(System.in);
	
	while(true)
	{
	System.out.println(" 1.  Addition\n 2. Subtraction\n 3. Multiplication\n 4. Division\n 5. Modulus\n 0 exit");             
               System.out.print("Select your choice  : ");
	int n=sc.nextInt();


	if(n>5||n<=0)
               {
	          System.out.print("entered Wrong Choice!\n");
	          break;
	}
               else
               {
                 System.out.print("Enter Two Numbers : ");
                 num1 = sc.nextInt();
                 num2 = sc.nextInt();
	 switch(n)
	 {
	case 1 :
		 result = num1+ num2;
                    	break;
	case 2 :  
		  result = num1- num2;
                    	break;
	case 3 : 
		result = num1* num2;
		break;
	case 4 :
           if(num2>0)
		{	 
		 result = num1/ num2;
                    	
                    	}
		else
		{
		System.out.println("second number should not be 0");
		result=0;
		}
           break;
	case 5 :
             result = num1% num2;
		 break;	
	
	default : System.out.print("entered Wrong Choice!\n");break;
	
	}          
          System.out.println("Result = " + result);
          }
           
	
	}
	}
}
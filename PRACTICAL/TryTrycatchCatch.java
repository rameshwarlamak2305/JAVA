package test;
import java.util.InputMismatchException;
import java.util.Scanner;
public class TryTrycatchCatch {

	
	
	    public static void main(String[] args) {
	         
	        Scanner sc = new Scanner(System.in);
	        try
	        {
	        	try
	        	{
	        		System.out.println("Enter value of X : ");
	        		int x=sc.nextInt();
	        		System.out.println("Enter value of Y : ");
	        		int y=sc.nextInt();
	        		System.out.println("The result is " +(x/y));
	        }
	        	catch (InputMismatchException e){
	            System.out.println("java.util.InputMismatchException");
	        }
	            
	        }
	        	catch(Exception e){
	            System.out.println(e);
	            }
	        }
	    }



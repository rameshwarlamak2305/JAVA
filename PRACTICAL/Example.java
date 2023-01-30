import java.util.*;
class Example
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
	
        //Taking input from the user
		System.out.println("gender");
	    char gender = sc.next().charAt(0); 
		System.out.println("age");
        int age = sc.nextInt();
        //checking if the age of a person is above 18 years or not
        if(age > 18){
            //nested if..elseif..if conditions
	        if(gender == 'M'){
	            System.out.println("eligible for Job reservation 40%");
	        }
	        else if(gender == 'F'){
	            System.out.println("eligible for Job reservation 60%");
	        }
	        else{
	            System.out.println("Not eligible to do a job");
	        }
        }
    }
}

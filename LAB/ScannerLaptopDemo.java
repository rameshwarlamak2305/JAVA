package lab2feb;

import java.util.Scanner;

public class ScannerLaptopDemo {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        
        // taking scanner object to take a input from user
		Scanner scanner = new Scanner(System.in);
        
        // define one instance variable for test switch case
        int input;
        // here we use do while loop for making Calculator
        do { 
        	
        	// here we take input from user to do some operation
            System.out.println("Enter Option:\n1. Add\n2. Subtract\n3. Multiply\n4. Even/OddNumber\n5. Quit");
            input = scanner.nextInt();
            
            switch (input) {
            
            // if we enter 1 test choice will match with add
                case 1:
                    System.out.println("Enter two numbers to do addition:");
                    int number1 = scanner.nextInt();
                    int number2 = scanner.nextInt();
                    System.out.println("The result is " + (number1 + number2));
                    break;
                
                 // if we enter 2 test choice will match with sub
                case 2:
                    System.out.println("Enter two numbers to do subtraction:");
                     number1 = scanner.nextInt();
                     number2= scanner.nextInt();
                    System.out.println("The result is " + (number1 - number2));
                    break;
                    
                 // if we enter 3 test choice will match with mul
                
                case 3:
                    System.out.println("Enter two numbers to be multiplied:");
                     number1 = scanner.nextInt();
                     number2 = scanner.nextInt();
                    System.out.println("The result is " + (number1 * number2));
                    break;
                    
                 // if we enter 4 test choice will match with even/odd
                
                case 4:
                    System.out.println("Enter a number to check it even or odd:");
                    int number = scanner.nextInt();
                    if (number % 2 == 0) {
                        System.out.println(number + " is even");
                    } else {
                        System.out.println(number + " is odd");
                    }
                    break;
                
                 // if we enter 5 test choice will match with end
                case 5:
                    System.out.println("end of program");
                    break;
                
                    
                    // here if we enter wrong choice more than 5 execute default case
                default:
                    System.out.println("Wrong choice");
                    break;
            }
        } while (input != 5); // if we enter 5 program will terminated
        
       
    }
}

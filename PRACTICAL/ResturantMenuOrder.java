package test;

import java.util.Scanner;
public class ResturantMenuOrder {

	public static void main(String[] args) {
		
		        // array to store FoodItem
		        String[] ColddrinkItems = {"Slice", "ThumbsUp", "Coca-Cola", "Maza"};
		        
		        // our menu card for Mamta mam
		        
		        for (int i = 0; i < ColddrinkItems.length; i++) {
		            System.out.println( ColddrinkItems[i]);
		        }
		        
		        // select how much colddrink you need from menu (user input)
		        @SuppressWarnings("resource")
				Scanner sc = new Scanner(System.in);
		        System.out.print("Please enter your order: ");
		        int Input = sc.nextInt();
		        
		        
		        
		        
		        // Display the mamta's choice using a switch statement
		        switch(Input) {
		            case 1:
		                System.out.println("Thank you for order: " + ColddrinkItems[0]);
		                break;
		            case 2:
		                System.out.println("Thank you for order: " +ColddrinkItems[1]);
		                break;
		            case 3:
		                System.out.println("Thank you for order: " + ColddrinkItems[2]);
		                break;
		            case 4:
		                System.out.println("Thank you for order: " + ColddrinkItems[3]);
		                break;
		            default:
		                System.out.println("Drinks not Available.");
		                break;
		        }
		    }

}

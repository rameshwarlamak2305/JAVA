package collection;

import java.util.ArrayList;

public class CopyArrayList7 {

	public static void main(String[] args) {
		
		
		
		
			ArrayList<String> colourList1 = new ArrayList<>();
			
			colourList1.add("Orange");
			colourList1.add("White");
			colourList1.add("Blue");
			

			ArrayList<String> colourList2 = new ArrayList<>(colourList1);

	        // print out the contents of the second ArrayList
	        System.out.println("Copied ArrayList: " + colourList2);
	}

}

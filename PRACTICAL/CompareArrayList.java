package collection;

import java.util.ArrayList;

public class CompareArrayList {

	public static void main(String[] args) {
		
		
		
        ArrayList<String> colourList1 = new ArrayList<>();
        ArrayList<String> colourList2 = new ArrayList<>();
		
		colourList1.add("Orange");
		colourList1.add("White");
		colourList1.add("Blue");
		

		colourList2.add("Orange");
		colourList2.add("White");
		colourList2.add("Blue");


		
		//System.out.println(colourList);
		
		if (colourList1.equals(colourList2)) {
            System.out.println("The two ArrayLists are equal");
        } else {
            System.out.println("The two ArrayLists are not equal");
        }

	}

}

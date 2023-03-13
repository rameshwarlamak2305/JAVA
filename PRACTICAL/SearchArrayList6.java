package collection;

import java.util.ArrayList;

public class SearchArrayList6 {

	public static void main(String[] args) {
		
		
ArrayList<String> colourList = new ArrayList<>();
		
		colourList.add("Orange");
		colourList.add("White");
		colourList.add("Blue");
		

		colourList.add("Green");
		colourList.add("Yellow");
		
		System.out.println(colourList);
		
	String element = "Green";
        int index = colourList.indexOf(element);
        if (index == -1) {
            System.out.println(element + " is not present in the ArrayList");
        } else {
            System.out.println(element + " is present at index " + index);
        }
	}

}

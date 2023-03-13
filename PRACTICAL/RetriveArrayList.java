package collection;

import java.util.ArrayList;

public class RetriveArrayList {

	public static void main(String[] args) {
		
		
    ArrayList<String> colourList = new ArrayList<>();
		
		colourList.add("Orange");
		colourList.add("White");
		colourList.add("Blue");
		

		colourList.add("Green");
		colourList.add("Yellow");
		
		//System.out.println(colourList);
		
		int index = 2;
        String element = colourList.get(index);
        System.out.println("Element at index " + index + ": " + element);

	}

}

package collection;

import java.util.ArrayList;

public class InsertArrayList3 {

	public static void main(String[] args) {
ArrayList<String> colourList = new ArrayList<>();
		
		colourList.add("Orange");
		colourList.add("White");
		colourList.add("Blue");
		

		colourList.add("Green");
		colourList.add("Yellow");
		
		//System.out.println(colourList);
		
		colourList.add(0, "Pink");
        System.out.println("ArrayList after insertion: " + colourList);
	}

}

package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorArrayList2 {

	public static void main(String[] args) {
ArrayList<String> colourList = new ArrayList<>();
		
		colourList.add("Orange");
		colourList.add("White");
		colourList.add("Blue");
		

		colourList.add("Green");
		colourList.add("Yellow");
		
		System.out.println(colourList);
		
		Iterator<String> itr=colourList.iterator();
		System.out.println(itr.next());
	}

}

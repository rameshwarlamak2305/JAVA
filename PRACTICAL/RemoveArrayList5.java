package collection;

import java.util.ArrayList;

public class RemoveArrayList5 {

	public static void main(String[] args) {
		
		
		 ArrayList<String> colourList = new ArrayList<>();
			
			colourList.add("Orange");
			colourList.add("White");
			colourList.add("Blue");
			

			colourList.add("Green");
			colourList.add("Yellow");
			
			int pos=3;
			String value=colourList.get(pos);
			System.out.println(value);
			colourList.remove(0);
	}

}

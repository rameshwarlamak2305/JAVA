package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayLIstColourEX {

	      public static void main(String[] args) {
	    	  
	    	  //object creation
	    	  ArrayList<String> preColourList=new ArrayList<>();
	    	  preColourList.add("Pink");
	    	  preColourList.add("Purple");
				ArrayList<String> colourList = new ArrayList<>();
				
				colourList.add("Orange");
				colourList.add("White");
				colourList.add("Blue");
				

				colourList.add("Green");
				colourList.add("Yellow");
				
				colourList.addAll(preColourList);
				colourList.add(1, "Yellow");
				
				//Traverse ArrayList
				System.out.println(colourList);
				
				int pos=3;
				String value=colourList.get(pos);
				System.out.println(value);
				colourList.remove(0);
				
				System.out.println(colourList);
				System.out.println(colourList.isEmpty());
				
				if(colourList.contains("Blue")) {
					colourList.remove("Blue");
					System.out.println(colourList);
				}
				
				boolean b=colourList.containsAll(preColourList);
				System.out.print(b);
				
				System.out.println(colourList.equals(preColourList));
				
				int index=colourList.indexOf("Blue");
				System.out.println(index);
				
				Iterator<String> itr=colourList.iterator();
				System.out.println(itr.next());
				
			    }

			}


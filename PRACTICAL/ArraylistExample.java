package collection;
import java.util.ArrayList;
public class ArraylistExample {
	
//	Number,Integer,String,Double,Float,Character

	public static void main(String[] args) {
		ArrayList<Object> integerCollection=new ArrayList<>();
		
		integerCollection.add(23);
		integerCollection.add("Shhhh");
		integerCollection.add(true);
		

		integerCollection.add('a');
		integerCollection.add(344.54f);
		
		
		System.out.println(integerCollection);
	}

}

package practical;

public class StringExample {
	public static void main(String[] args) {	
		//----------Comparison---------
		String a1 = "Anudip";
		String a4= "Anudip";
		String a3= new String("anudip");
		String a2= "Anudip Foundation Vashi";
		//equals() compares values of String for equality
		System.out.println(a1.equals(a2));  //false
		System.out.println(a1.equals(a3)); //false, coz case mismatch
	System.out.println(a1.equalsIgnoreCase(a3));  //true
		
	//== compares references not values
	System.out.println(a1==a2); //false
	System.out.println(a1==a4); //true
		
	//lexicographically, compareTo()  
	String a5 = "apple";
	String a6= "america";
	System.out.println(a6.compareTo(a5)); //negative
	System.out.println(a1.compareTo(a4)); //zero
	System.out.println(a2.compareTo(a1)); //positive
		
	//------concatenation-------
	System.out.println(a5+ " " +a6);
	System.out.println(60+70+"my"+90+7.4);//before String its +, after string '+' as concat
	System.out.println(a5.concat(a6));
	
	
	//------substring-----
	 System.out.println(a2.substring(0, 2));
	 System.out.println(a2.substring(6));
	 System.out.println(a2.substring(17));
	}
}
package test;

public class StringMutuable {

	public static void main(String[] args) {
		StringBuffer s1=new StringBuffer(" Anudip Foundation ");
	System.out.println(	s1.append("Vashi"));
	System.out.println(s1);
	
	System.out.println(s1.insert(0,"NGO-"));
	
	StringBuilder s2=new StringBuilder("java Program");
	
	System.out.println(s2.replace(4, 8, "Java"));
	
	System.out.println(s2.delete(5,9));
	
	System.out.println(s2.reverse());
	
	
	}

}

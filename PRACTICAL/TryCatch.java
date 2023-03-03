package test;

public class TryCatch {

	public static void main(String[] args) {
		
		try { // arithmetic exception
			//int num = 88/0; //may throw exception
			// int num = 88/5;
			
			
			String num=null;// null pinter exception
			System.out.print(num.length());
			
			String m= "Java";
			int i= Integer.parseInt(m);
			System.out.println(i);
			
		}catch(Exception e) { //handle exception
			System.out.println(e +" cannot divide by zero ");
			
		}
		
	}

}

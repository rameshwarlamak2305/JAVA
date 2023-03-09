package test;

public class TestCustomException {
	static  void checkAge(int age) throws VerificationException {
		
		if(age<18 || age>25) {
			throw new VerificationException("age should be 18-25");
		}
		
		else {
			
			System.out.println("Student are eligible");
		}
		
	}

	public static void main(String[] args) {
		
		try {
			checkAge(15);
			
		}catch(VerificationException e) {
			System.out.println(e);
		}
		
		
			
	}

}

class Typecast
{
	public static void main(String[] args){
		//widening
		int x=580;
		long z = x;//implicit int to long
		System.out.println(x);
		System.out.println(z);

		double y=x;//implicit int to double
		System.out.println(y);
		//narrowing
		double a=555.5;
        int b=(int)a;//explicit double to int
		System.out.println(b);
	}



}

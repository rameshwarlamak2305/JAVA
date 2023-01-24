class Logical 
{
	int a=10;
	int b=5;
	public void bitwise(){
		System.out.println(a<b ? a+b :a-b);// condition false ternary opertor used third expression executed
	}




	public static void main(String[] args)
	
	{
		Logical l1=new Logical();
		l1.bitwise();
		System.out.println("Logical operator &&");
        System.out.println((10>5) && (2>1));//true
        System.out.println((10>5) && (2<1));//flase
        System.out.println((10<5) && (2<1));//flase 

        System.out.println("Logical operator ||");
        System.out.println((10>5) || (2>1));//true
        System.out.println((10>5) || (2<1));  //true
        System.out.println((10<5) || (2<1));   //flase 
        
        
        System.out.println("Logical operator and");
        System.out.println("logical operator or");


	}
     
}

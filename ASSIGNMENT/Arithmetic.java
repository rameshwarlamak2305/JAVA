class Arithmetic 
{
 public void add(){
	 int a=30;
	 int b=20;
	 System.out.println("Addition" +(a+b));
	 System.out.println("sub" +(a-b));
	 System.out.println("mul" +(a*b));
	 System.out.println("div" +(a/b));
	 System.out.println("mod" +(a%b));

}
 public static void main(String[] args){
	 Arithmetic obj= new Arithmetic();
	 obj.add();
 }
}

class Unary{

	public void calincrement(){
		int x= 10;
		System.out.println(x++);
		System.out.println(x++);
		System.out.println(++x);
		System.out.println(x++);
		System.out.println(x);
	}
     public void caldecrement(){
		int x= 10;
		System.out.println(x--);
		System.out.println(x--);
		System.out.println(--x);
		System.out.println(x--);
		System.out.println(x);
	}
  public static void main(String[] args){
	  Unary obj=new Unary();
	  obj.calincrement();
	  obj.caldecrement();
  }
}






	



class My
{
	My(){
		System.out.println("xyz");
	}
	int a;
	String name;
	public void display(){
		System.out.println(a+" "+ name);
	}
	public static void main(String[] args){
		System.out.println("ree");
		My b= new My();
		b.display();
	}

}
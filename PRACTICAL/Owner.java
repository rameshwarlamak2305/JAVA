class Owner{//super
	int area=1000;
	String dateofpurchase="23-05-2000";
	String name="Ram";
	boolean noc=true;
     
}

class New_owner extends Owner//sub
{
	String dateofRegister="3-2-2023";
	double flatvalue=2.5000000;

    public void display(){
		System.out.println("Area is :"+area);// parent property
		System.out.println("name :"+name);
		System.out.println("price :"+flatvalue);
}
}

class InheritanceExample{
	public static void main(String[] args){
		New_owner c=new New_owner();// child obj
		c.display();
	
	}

}
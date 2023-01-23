class StudentVar 
{
 static int rollno=10;// static
 long phoneno=12345;// instance
 public void ram(){
	 char name='R';
	 double batch=1.1;
	 System.out.println("local var :"+name);//localvar
	 System.out.println("local var :"+batch);//localvar
	 
 }
 public static void shyam(){
	 char name1='S';
	 double batch1=1.2;
	 System.out.println("local var:"+name1);//
	 System.out.println("local var:"+batch1);
 }
 public static void main(String[] args){
	 StudentVar obj=new StudentVar();
	 obj.ram();//non static method
	 shyam();// invoke static method
	 System.out.println("instance var:"+obj.phoneno);//calling instance var
	 System.out.println("static var:"+rollno);// calling static var



}

}

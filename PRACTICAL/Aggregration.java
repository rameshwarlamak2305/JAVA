class Idproof{
	int inum;
	String city;
	String state;
	int pin;

	Idproof(int inum,String city,String state,int pincode){
		this.inum=inum;
		this.state=state;
		this.city=city;

		this.pin=pin;
	}
}

class Student
{

	int id;
	String name;
	String emailid;
	long contact;
	Idproof idp;//has a relation with above class

	Student(int id,String name,String emailid,long contact,Idproof idp){
		this.id=id;
		this.name=name;
		this.emailid=emailid;
		this.contact=contact;
		this.idp=idp;
}

public void show(){
	System.out.println(id+" "+name+" "+emailid+" "+contact);
	System.out.println(idp.inum+" "+idp.city+" "+idp.state+" "+idp.pin);
}
}

class Aggregration{
	public static void main(String[] args){
		
   Idproof i=new Idproof(102,"Mumbai","mh",1234);
   Idproof i1=new Idproof(103,"alnbai","al",12345);
 //  Idproof i2=new Idproof(104,"cnbai","cn",12346);

   Student s=new Student(1,"ram","ram@gmail.com",123455,i);
   Student s1=new Student(2,"sam","sam@gamil.com",234565,i1);

   s.show();
   s1.show();
	}
}
   




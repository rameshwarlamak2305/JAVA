package threading;
@FunctionalInterface
interface Myname{
	void name();
}
@FunctionalInterface
interface Myname1{
	void printname(String name);
}
@FunctionalInterface
interface Myname2{
	int add(int num);
}
@FunctionalInterface
interface Myname3{
	int small(int a, int b, int c);
}
class Xyz implements Myname{

	@Override
	public void name() {
		// TODO Auto-generated method stub
		System.out.println("this is normal approach");
	}
	
}
public class App1 {

	public static void main(String[] args) {
		// first approach
		Myname a=new Xyz();
		a.name();
		
		//second approach
		Myname b=new Myname() {

			@Override
			public void name() {
				System.out.println("this is second approach");
				
			}
			
		};
		
		b.name();
		
		//Third approach Lambda Expression to concise our code java 8 feature
		//Rule No.1-> if statement is only one line there is
		//is no need to make a curly braces{};
		Myname c = ()->System.out.println(" this is first name");
		  c.name();
		
		  Myname d= ()->{
			  System.out.println("this is first name");
			  System.out.println("this is second name");
		  };
		  d.name();
		  
		  //Rule No.2-> there is no need to specify dataType of argument
		  //Rule No.3-> if a Multiple argument is present then there is
		  // need to specify round bracket
		  
		  Myname1 e=name->System.out.println("Hi"+name);
		  e.printname("Mahesh sir");
		  e.printname(" Shyam");
		  
		  Myname2 f=num->num+num;
		  for(int i=1;i<=10;i++)
			  System.out.println(f.add(i));
		  
		  Myname3 g=(val1,val2,val3)->{
			  if(val1<val2&&val1<val3)
				  return val1;
			  else if(val2<val1&&val2<val3)
				  return val2;
			  else 
				  return val3;
		  };
		  
		
		System.out.println(g.small(15, 20, 25));
		
	}

}

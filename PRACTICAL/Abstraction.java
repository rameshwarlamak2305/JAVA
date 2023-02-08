

abstract class Shape{

int width=10;

int height=5;

Shape(){

}

abstract void draw();

void display()
	{

System.out.println("Displaying shape");
	}
}

class Triangle extends Shape{

void draw()
	{

System.out.println("Drawing triangle");
	}
}
class Square extends Shape

{
	void draw(){
	System.out.println("drawing Square");
}
}
class Abstraction
{

public static void main(String[] args){
	Triangle t=new Triangle();
	t.display();
	t.display();
	 Square s= new Square();
	 s.display();
	 s.draw();
}
}
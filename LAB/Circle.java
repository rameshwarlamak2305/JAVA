package shapes;

public class Circle {//defining the class 
	private static float radius; //as per the question private float variable with name raduis
	protected float pi;//package level access variable pi
	public Circle(){//default constructor
		super();
		Circle.radius=1.5f;//initializing the value of raduis by 1..5f
	}
	protected Circle(float raduis){//package level access to parametrized construcator
		this(radius,3.5f);//pi value by 3.5f
	}
	@SuppressWarnings("static-access")
	private Circle(float raduis,float pi){//class level access to the prametrized circle constructor
		super();
		this.pi=pi;// Initializes the radius with the value passed in.
		this.radius=raduis;// Initializes the radius with the value passed in.
	}
	double calculateCircleArea (float raduis) {//method to calculate the area of circle
		double result;//defining the result variable
		result=(pi*raduis*raduis);//formula to calculate the area and 
		return result; //willl return the value as area of circle
		
	}
	double calculateCircumference(float raduis) {//method to calculate the circumference of circle
		
		double result;//defining the result to stor the final circumference value
		result=(2 * pi * raduis);//formula to calculate the circumference of circle
		return result;//result will be return here
		
	}
	public static void main(String args[]) {
		Circle c=new Circle(8);//calling the constructor and creating the object
		double area =c.calculateCircleArea(8);//to calculate the area called the area method
		System.out.println("The Area of Circle is :" +area);//will display the area 
		double circum=c.calculateCircumference(8);//for circumference 
		System.out.println("The Circumference of Circle is :" +circum);//to display the circumference
	}

}
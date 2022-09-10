
public class CircleCheck {
	public static void main(String[] args) {
		//Default Constructor
		Circle circle1=new Circle();
		System.out.println(circle1.calculateArea());
		
		
		//Parameterized Constructor
		Circle circle2=new Circle(5);
		System.out.println(circle2.calculateArea());
	}
}

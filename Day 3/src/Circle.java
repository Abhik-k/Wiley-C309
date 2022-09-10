
public class Circle {
	static double PI=3.14;
	int radius;
	double area;
	
	public Circle() {
		this.radius=4;
	}

	public Circle(int radius) {
		this.radius = radius;
	}
	
	public double calculateArea() {
		this.area=PI*radius*radius;
		return this.area;
	}	
}

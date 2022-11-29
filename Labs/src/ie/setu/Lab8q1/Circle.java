package ie.setu.Lab8q1;

public class Circle extends TwoDShape {
	//attributes
	private double radius;

	//Constructors
	public Circle(String name, String colour, double radius) {
		super(name, colour);
		this.radius = radius;
	}

	//setters and getters
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		return Math.PI * radius * radius;
	}
	
	
}

package ie.setu.Lab8q1;

public class Rectangle extends TwoDShape {
	//attributes
	private double length;
	private double breadth;

	//Constructors
	public Rectangle(String name, String colour, double length, double breadth) {
		super(name, colour);
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public double area() {
		return length * breadth;
	}
}
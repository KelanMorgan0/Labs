package ie.setu.Lab8q1;

public class Triangle extends TwoDShape {
	//attributes
	private double base;
	private double height;
	
	//constructors
	public Triangle(String name, String colour, double base, double height) {
		super(name, colour);
		this.base = base;
		this.height = height;
	}

	@Override
	public double area() {
		return 0.5 * base * height;
	}
	
}

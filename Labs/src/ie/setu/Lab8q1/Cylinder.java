package ie.setu.Lab8q1;

public class Cylinder extends ThreeDShape{
	//attributes
	private double radius;
	private double height;
	
	//constructors
	public Cylinder(String name, String colour, int radius, int height) {
		super(name, colour);
		this.radius = radius;
		this.height = height;
	}

	@Override
	public double volume() {
		return Math.PI * radius * radius * height;
	}

	@Override
	public double area() {
		return (2 * Math.PI * radius * height) + (2 * Math.PI * radius * radius);
	}
	
	
}

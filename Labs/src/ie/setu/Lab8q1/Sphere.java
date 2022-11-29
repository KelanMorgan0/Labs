package ie.setu.Lab8q1;

public class Sphere extends ThreeDShape {
	//attributes
	private double radius;

	public Sphere(String name, String colour, double radius) {
		super(name, colour);
		this.radius = radius;
	}

	@Override
	public double volume() {
		return (4/3) * Math.PI * radius * radius * radius;
	}

	@Override
	public double area() {
		return 4 * Math.PI * radius * radius;
	}
	
	
}

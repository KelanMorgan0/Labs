package ie.setu.Lab5;

public class Circle extends Point {
	//attributes
	private int radius;
	
	//constructors
	public Circle() {
		super(0, 0);
		radius = 0;
	}

	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}
	
	//setters and getters
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	//to string method
	public String toString() {
		return "Circle [radius=" + radius + ", x=" + x + ", y=" + y + "]";
	}
	
}

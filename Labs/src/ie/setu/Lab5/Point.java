package ie.setu.Lab5;

public class Point {
	//attributes
	protected int x;
	protected int y;
	
	//constructors
	public Point() {
		x = 0;
		y = 0;
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	
	//setters and getters
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	//to string method
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	
}

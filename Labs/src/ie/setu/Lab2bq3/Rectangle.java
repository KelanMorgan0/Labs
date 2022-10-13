package ie.setu.Lab2bq3;

public class Rectangle {
	//attributes
	private double length;
	private double width;
	
	//constructors
	public Rectangle() {
		length = 1.0;
		width = 1.0;
	}
	
	//setter and getter methods
	public void setLength(double length) {
		this.length = length;
	}
	public double getLength() {
		return length;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	public double getWidth() {
		return width;
	}
	
	//to string method
	public String toString() {
		return "Length = " + length + ", width = " + width;
	}
	
	//methods
	//method to calculate the area
	public double getArea() {
		return length * width;
	}
	//method to calcualte the perimeter
	public double getPerimeter() {
		return (length * 2) + (width * 2);
	}
	
	//method to print the rectangle to the console
	public void printRectangle() {
		for(int i = 0; i < length; i++) {
			for(int j = 0; j < width; j++) {
				if(j == width-1) {
					System.out.println("*");
				}
				else if(i == 0 || j == 0 || i == length - 1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
		}
	}
}

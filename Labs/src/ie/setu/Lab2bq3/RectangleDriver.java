package ie.setu.Lab2bq3;

public class RectangleDriver {

	public static void main(String[] args) {
		// initialize Rectangle object
		Rectangle rectangle = new Rectangle();
		
		//test the Rectangle class
		rectangle.setLength(20.0);
		rectangle.setWidth(30.0);
		
		//print the rectangle class to the console
		System.out.println(rectangle.toString());
		
		//print the area and perimeter to the console
		System.out.println(rectangle.getArea());
		System.out.println(rectangle.getPerimeter());
		
		//print the rectangle to the console
		rectangle.printRectangle();
	}

}

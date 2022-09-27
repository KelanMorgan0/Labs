package ie.setu.Lab1q1;

// Student Name 	: Kelan Morgan
// Student Id Number: C00262090
// Date 			: Sep-2022
// Purpose 			: My first class implementation

public class ThermTest
{ // begin class ThermTest
	public static void main(String args[]) 
	{ // being main method
		//variables
		double tempB;
		
		Thermometer thermA = new Thermometer();		// Create an instance of our Thermometer class
		Thermometer thermB = new Thermometer(10.0);

		//store the temperature of thermB to tempB
		tempB = thermB.getCelsius();
		
		System.out.println("Temp. of Thermometer A is " + thermA.getCelsius() );
		thermA.setCelsius(20.0);
		System.out.println("Temp. of Thermometer A is " + thermA.getCelsius() );
		System.out.println("Temp. of Thermometer B is " + tempB);
	} // end main
} // end class ThermTest
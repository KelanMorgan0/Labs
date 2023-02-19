package ie.setu.Lab15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class VerifyRangeTest {

	public static void main(String[] args) {
		//variables
		Scanner in = new Scanner(System.in);
		Verifier verify = new Verifier();
		boolean loop = true;
		int value = 0;
		String password = "";
		
		do {
			System.out.println("Please enter an integer:");
			try {
				value = in.nextInt();
				loop = false;
			}
			catch(InputMismatchException inputMismatchException) {
				System.out.println("\nException: " + inputMismatchException);
				in.nextLine();
				System.out.println("You must enter an integer!");
			}
		} while(loop);
		
		verify.verifyIntRange(value, 1, 100);
		loop = true;
		do {
			System.out.println("Please enter a password:");
			try {
				password = in.next();
				loop = false;
			}
			catch(InputMismatchException inputMismatchException) {
				System.out.println("\nException: " + inputMismatchException);
				in.nextLine();
				System.out.println("You must enter a String!");
			}
		}	while(loop);
		
		verify.verifyPasswordStrength(password);
		
	}

}

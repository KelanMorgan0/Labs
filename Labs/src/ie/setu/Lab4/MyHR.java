package ie.setu.Lab4;

import java.util.Scanner;

public class MyHR {

	public static void main(String[] args) {
		//variables
		int option;
		
		//initialize office objects
		Office[] offices = new Office[3];
		for(int i = 0; i < 3; i++) {
			offices[i] = new Office();
		}
		
		//initialize scanner
		Scanner in = new Scanner(System.in);
		
		//
		
		//allow the user to choose an option from the menu
		System.out.println("MENU");
		System.out.println("------------------------------");
		System.out.println("1. List all offices");
		System.out.println("2. Create new employee record");
		System.out.println("3. List all employees");
		System.out.println("------------------------------");
		System.out.print("enter option: ");
		
		option = in.nextInt();
		
		switch(option) {
		case 1:
			
			break;
		case 2:
			if(Employee.getNextEmployeeNumber() < 1005) {
				
			}
			break;
		case 3:
			break;
		default:
			System.out.println("Invalid option!");
			break;
		}
	}

}

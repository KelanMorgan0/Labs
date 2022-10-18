package ie.setu.CA1;
import java.util.Scanner;

public class Citizens {

	public static void main(String[] args) {
		//initialize scanner
		Scanner in = new Scanner(System.in);
		
		// create 3 citizen objects
		Citizen[] citizens = new Citizen[3];
		
		//allow the user to enter the citizen information
		for(int i = 0; i < 3; i++) {
			citizens[i] = new Citizen();
			
			System.out.print("Enter First Name: ");
			citizens[i].setFirstName(in.nextLine());
			
			System.out.print("Enter Last Name: ");
			citizens[i].setLastName(in.nextLine());
			
			System.out.print("Enter Gender(M or F): ");
			citizens[i].setGender(in.nextLine().toCharArray()[0]);
			
			System.out.print("Enter Marital Status(M or S): ");
			citizens[i].setMaritalStatus(in.nextLine().toCharArray()[0]);
			
			if(citizens[i].getMaritalStatus() == 'M' && citizens[i].getGender() == 'F') {
				System.out.print("Enter Maiden Name:");
				citizens[i].setMaidenName(in.nextLine());
			}
			System.out.println();
			//show the count of citizens
			System.out.println("Number of Citizens: " + Citizen.CitizenCount() + "\n");
		}
		
		//print all citizens
		System.out.println(citizens[0].toString());
		System.out.println(citizens[1].toString());
		System.out.println(citizens[2].toString());
	}

}

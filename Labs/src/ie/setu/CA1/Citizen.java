package ie.setu.CA1;

public class Citizen {
	//attributes
	private String firstName;
	private String lastName;
	private char gender;
	private int ppsNumber = 1000;
	private char maritalStatus;
	private String maidenName;
	private static int numberOfRecords = 0;
	
	//constructors
	public Citizen() {
		firstName="";
		lastName="";
		gender=' ';
		maritalStatus=' ';
		maidenName="";
		numberOfRecords++;
		ppsNumber+= numberOfRecords;
	}
	
	//setters and getters
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getFirstName() {
		return firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getLastName() {
		return lastName;
	}
	
	public void setGender(char gender) {
		if (gender == 'M' || gender == 'F') {
			this.gender = gender;
		}
		else {
			System.out.println("Must enter 'M' or 'F'");
		}
	}
	public char getGender() {
		return gender;
	}
	
	public void setPPSNumber(int ppsNumber) {
		this.ppsNumber = ppsNumber;
	}
	public int getPPSNumber() {
		return ppsNumber;
	}
	
	public void setMaritalStatus(char maritalStatus) {
		if(maritalStatus == 'M' || maritalStatus == 'S') {
			this.maritalStatus = maritalStatus;
		}
		else {
			System.out.println("Must enter 'M' or 'S'");
		}
	}
	public char getMaritalStatus() {
		return maritalStatus;
	}
	
	public void setMaidenName(String maidenName) {
		this.maidenName = maidenName;
	}
	public String getMaidenName() {
		return maidenName;
	}
	
	//toString method
	public String toString() {
		String citizen;
		
		citizen = "First Name:\t" + firstName;
		citizen += "\nLast Name:\t" + lastName;
		citizen += "\nGender:\t\t" + gender;
		citizen += "\nPPS Number:\t" + ppsNumber;
		citizen += "\nMarital status\t" + maritalStatus;
		citizen += "\nMaiden Name:\t" + maidenName + "\n";
		
		return citizen;
	}
	
	//Methods
	public static int CitizenCount() {
		return numberOfRecords;
	}
}

package ie.setu.Lab4;

public class Office {
	//Attributes
	private static int nextRoomNumber = 100;
	private int roomNumber;
	private int numOfEmployees;
	private Employee employee1;
	private Employee employee2;
	
	//constructors
	public Office() {
		roomNumber = nextRoomNumber;
		nextRoomNumber++;
		numOfEmployees = 0;
		employee1 = new Employee();
		employee2 = new Employee();
	}
	
	public Office(int roomNumber, int numOfEmployees, Employee employee1) {
		this.roomNumber = roomNumber;
		this.numOfEmployees = 0;
		this.employee1 = employee1;
		numOfEmployees = 1;
		employee2 = new Employee();
	}
	
	public Office(int roomNumber, int numOfEmployees, Employee employee1, Employee employee2) {
		this.roomNumber = roomNumber;
		this.numOfEmployees = 0;
		this.employee1 = employee1;
		this.employee2 = employee2;
		numOfEmployees = 2;
	}

	//setters and getters
	public static int getNextRoomNumber() {
		return nextRoomNumber;
	}
	public static void setNextRoomNumber(int nextRoomNumber) {
		Office.nextRoomNumber = nextRoomNumber;
	}
	
	public int getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public int getNumOfEmployees() {
		return numOfEmployees;
	}

	public void setNumOfEmployees(int numOfEmployees) {
		this.numOfEmployees = numOfEmployees;
	}

	//to string method
	
	
	@Override
	public String toString() {
		return "Office [roomNumber=" + roomNumber + ", numOfEmployees=" + numOfEmployees + ", employee1=" + employee1
				+ ", employee2=" + employee2 + "]";
	}

	//methods
	public int numberOfEmployees() {
		return numOfEmployees;
	}
	
	public Employee[] Employees() {
		Employee[] employees = new Employee[2];
		employees[0] = employee1;
		employees[1] = employee2;
		return employees;
	}
}

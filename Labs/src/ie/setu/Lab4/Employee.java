package ie.setu.Lab4;

public class Employee {
	//attributes
	private static int nextEmployeeNumber = 1000;
	private int employeeNumber;
	private String employeeType;
	private String carMake;
	private String carModel;
	private String carRegistration;
	private Address address;
	
	//constructors
	public Employee() {
		employeeNumber = nextEmployeeNumber;
		nextEmployeeNumber++;
		employeeType = "";
		carMake = "";
		carModel = "";
		carRegistration = "";
		address = new Address();
	}

	
	public Employee(int employeeNumber, String employeeType, String carMake, String carModel, String carRegistration,
			Address address) {
		super();
		this.employeeNumber = employeeNumber;
		this.employeeType = employeeType;
		this.carMake = carMake;
		this.carModel = carModel;
		this.carRegistration = carRegistration;
		this.address = address;
	}

	//setters and getters
	public int getEmployeeNumber() {
		return employeeNumber;
	}
	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public static int getNextEmployeeNumber() {
		return nextEmployeeNumber;
	}
	public static void setNextEmployeeNumber(int nextEmployeeNumber) {
		Employee.nextEmployeeNumber = nextEmployeeNumber;
	}

	public String getEmployeeType() {
		return employeeType;
	}

	public void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}

	public String getCarMake() {
		return carMake;
	}

	public void setCarMake(String carMake) {
		this.carMake = carMake;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public String getCarRegistration() {
		return carRegistration;
	}

	public void setCarRegistration(String carRegistration) {
		this.carRegistration = carRegistration;
	}

	//to string method
	public String toString() {
		return "Employee [employeeNumber=" + employeeNumber + ", employeeType=" + employeeType + ", carMake=" + carMake
				+ ", carModel=" + carModel + ", carRegistration=" + carRegistration + "]";
	}
	
	//methods
	public static int numberOfEmployees() {
		return nextEmployeeNumber - 1001;
	}
	
}

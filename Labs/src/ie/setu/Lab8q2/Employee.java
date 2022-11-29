package ie.setu.Lab8q2;

public class Employee extends Person {
	//attributes
	private Double salary;

	public Employee(String name, Double salary) {
		super(name);
		this.salary = salary;
	}

	@Override
	public String getDiscription() {
		return "An employee with a salary of " + salary;
		
	}
	
}

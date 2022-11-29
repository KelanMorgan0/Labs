package ie.setu.Lab8q2;

public class TestPerson {

	public static void main(String[] args) {
		//create a person array
		Person[] people = new Person[2];
		people[0] = new Employee("john", 15.50);
		people[1] = new Student("peter", "Software Dev");
		
		//print the elements of the array
		System.out.println("Name: " + people[0].getName());
		System.out.println("Description: " + people[0].getDiscription());
		System.out.println();
		System.out.println("Name: " + people[1].getName());
		System.out.println("Description: " + people[1].getDiscription());
	}

}

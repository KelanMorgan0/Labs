package ie.setu.Lab8q2;

public abstract class Person {
	//attributes
	private String name;

	//constructors
	public Person(String name) {
		this.name = name;
	}

	//setters and getters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	
	public abstract String getDiscription();
}

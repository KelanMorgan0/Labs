package ie.setu.Lab7;

public class Vet {
	//attributes
	private String name;

	//constructors
	public Vet(String name) {
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
		return "Vet [name=" + name + "]";
	}
	
	//methods
	public void Vaccinate(Animal animal) {
		System.out.println(name + " is vaccinating");
		if(animal instanceof Dog)
		{
			System.out.println("Dog has been vaccinated: ");
			System.out.println(animal.toString());
		}
		else {
			System.out.println("Cat has been vaccinated: ");
			System.out.println(animal.toString());
		}
	}
}

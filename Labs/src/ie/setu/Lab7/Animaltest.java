package ie.setu.Lab7;

public class Animaltest
{
	public static void main (String args[])
	{
		Vet vet = new Vet("Paul");
		Animal dog = new Dog("Poodle", 4, 'M');
		System.out.println(dog);
		dog.eat();
		dog.sleep();
		dog.makeSound();
		vet.Vaccinate(dog);
		System.out.println();
		
		Animal cat = new Cat("Tom", 2, 'F');
		System.out.println(cat);
		cat.eat();
		cat.sleep();
		cat.makeSound();
		vet.Vaccinate(cat);
		
	}
}
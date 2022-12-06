package ie.setu.Lab9q2;

public class TaxDriver {

	public static void main(String[] args) {
		RoadVehicle[] vehicle = new RoadVehicle[2];
		vehicle[0] = new Car(4, 4, "Toyota");
		vehicle[1] = new Hgv(8, 1, 100);
		
		System.out.println(((Car)vehicle[0]).calculateDuty());
		System.out.println(((Hgv)vehicle[1]).calculateDuty());
	}

}

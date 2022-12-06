package ie.setu.Lab9q2;

public class Car extends RoadVehicle implements ImportDuty{
	private String carType;

	public Car() {
		this(0, 0, "");
	}
	
	public Car(int w, int p, String carType) {
		super(w, p);
		this.carType = carType;
	}

	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	@Override
	public double calculateDuty() {
		return (getWheels() * 100 * CARTAXRATE);
	}
	
	
}

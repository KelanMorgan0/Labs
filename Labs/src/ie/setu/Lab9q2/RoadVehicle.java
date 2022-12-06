package ie.setu.Lab9q2;

public class RoadVehicle{
	private int wheels;
	private int passengers;
	
	public RoadVehicle() {
		this(0, 0);
	}

	public RoadVehicle(int w, int p) {
		this.wheels = w;
		this.passengers = p;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public int getPassengers() {
		return passengers;
	}

	public void setPassengers(int passengers) {
		this.passengers = passengers;
	}
	
	
}

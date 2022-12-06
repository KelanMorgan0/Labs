package ie.setu.Lab9q2;

public class Hgv extends RoadVehicle implements ImportDuty{
	private int cargo;

	public Hgv() {
		this(0, 0, 0);
	}
	
	public Hgv(int w, int p, int cargo) {
		super(w, p);
		this.cargo = cargo;
	}

	public int getCargo() {
		return cargo;
	}

	public void setCargo(int cargo) {
		this.cargo = cargo;
	}

	@Override
	public double calculateDuty() {
		return ((getWheels() + cargo) * 100 * HGVTAXRATE);
	}
	
}

package ie.setu.Lab4;

public class Address {
	//Attributes
	private String street;
	private String cityOrTown;
	private String county;
	
	//constructors
	public Address() {
		street = "";
		cityOrTown = "";
		county = "";
	}
	
	public Address(String street, String cityOrTown, String county) {
		this.street = street;
		this.cityOrTown = cityOrTown;
		this.county = county;
	}

	//setters and getters
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCityOrTown() {
		return cityOrTown;
	}

	public void setCityOrTown(String cityOrTown) {
		this.cityOrTown = cityOrTown;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	//to string method
	public String toString() {
		return "Address [street=" + street + ", cityOrTown=" + cityOrTown + ", county=" + county + "]";
	}
	
}

package ie.setu.Lab2q3;

public class HotelRoom {
	//attributes
	private int roomNumber;
	private String roomType;
	private int occupied;
	private double rate;
	
	//constructors
	public HotelRoom() {
		roomNumber = 0;
		roomType = "";
		occupied = 0;
		rate = 0.0;
	}
	public HotelRoom(int roomNumber, String roomType, int occupied, double rate) {
		this.roomNumber = roomNumber;
		this.roomType = roomType;
		this.occupied = occupied;
		this.rate = rate;
	}
	
	//setters and getters
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	public int getRoomNumber() {
		return roomNumber;
	}
	
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public String getRoomType() {
		return roomType;
	}
	
	public void setOccupied(int occupied) {
		this.occupied = occupied;
	}
	public int getOccupied() {
		return occupied;
	}
	
	public void setRate(double rate) {
		this.rate = rate;
	}
	public double getRate() {
		return rate;
	}
}

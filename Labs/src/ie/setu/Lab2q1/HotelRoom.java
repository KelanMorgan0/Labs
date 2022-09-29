package ie.setu.Lab2q1;

public class HotelRoom {
	//attributes
	private int roomNumber;
	private String roomType;
	
	//constructors
	public HotelRoom() {
		roomNumber = 0;
		roomType = "";
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
}

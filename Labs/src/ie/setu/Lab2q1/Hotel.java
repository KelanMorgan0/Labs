package ie.setu.Lab2q1;

public class Hotel {

	public static void main(String[] args) {
		//initialize objects
		HotelRoom roomA = new HotelRoom();
		HotelRoom roomB = new HotelRoom();
		
		//set attributes in the rooms
		roomA.setRoomNumber(200);
		roomA.setRoomType("Single");
		roomB.setRoomNumber(201);
		roomB.setRoomType("Double");
		
		//print room details
		System.out.println("roomA's number is: " + roomA.getRoomNumber());
		System.out.println("and the room type is: " + roomA.getRoomType());
		System.out.println("roomB's number is: " + roomB.getRoomNumber());
		System.out.println("and the room type is: " + roomB.getRoomType());
	}

}

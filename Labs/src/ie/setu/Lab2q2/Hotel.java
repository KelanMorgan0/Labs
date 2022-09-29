package ie.setu.Lab2q2;

public class Hotel {

	public static void main(String[] args) {
		//initialize objects
		HotelRoom roomA = new HotelRoom();
		HotelRoom roomB = new HotelRoom();
		
		//set attributes of rooms
		roomA.setRoomNumber(200);
		roomA.setRoomType("Single");
		roomA.setOccupied(1);
		roomA.setRate(100);
		roomB.setRoomNumber(201);
		roomB.setRoomType("Double");
		roomB.setOccupied(0);
		roomB.setRate(80);
		
		
		//print room details
		System.out.println("roomA number: " + roomA.getRoomNumber());
		System.out.println("room type: " + roomA.getRoomType());
		System.out.println("Occupied: " + roomA.getOccupied());
		System.out.println("rate: " + roomA.getRate());
		System.out.println();
		System.out.println("roomB's number is: " + roomB.getRoomNumber());
		System.out.println("and the room type is: " + roomB.getRoomType());
		System.out.println("Occupied: " + roomB.getOccupied());
		System.out.println("rate: " + roomB.getRate());
	}

}

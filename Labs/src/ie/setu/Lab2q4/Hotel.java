package ie.setu.Lab2q4;

public class Hotel {

	public static void main(String[] args) {
		//initialize objects
		HotelRoom roomA = new HotelRoom();
		HotelRoom roomB = new HotelRoom();
		HotelRoom roomC = new HotelRoom(202, "single", 0, 90);
		
		//set attributes of rooms
		roomA.setRoomNumber(200);
		roomA.setRoomType("Single");
		roomA.setOccupied(1);
		roomA.setRate(100);
		roomB.setRoomNumber(201);
		roomB.setRoomType("Double");
		roomB.setOccupied(1);
		roomB.setOccupied(1);
		roomB.setRate(80);
		
		
		//print room details
		System.out.println("roomA's number: " + roomA.getRoomNumber());
		System.out.println("room type: " + roomA.getRoomType());
		System.out.println("Occupied: " + roomA.getOccupied());
		System.out.println("rate: " + roomA.getRate());
		System.out.println();
		System.out.println("roomB's number: " + roomB.getRoomNumber());
		System.out.println("room type: " + roomB.getRoomType());
		System.out.println("Occupied: " + roomB.getOccupied());
		System.out.println("rate: " + roomB.getRate());
		System.out.println();
		System.out.println("roomC's number: " + roomC.getRoomNumber());
		System.out.println("room type: " + roomC.getRoomType());
		System.out.println("Occupied: " + roomC.getOccupied());
		System.out.println("rate: " + roomC.getRate());
	}

}

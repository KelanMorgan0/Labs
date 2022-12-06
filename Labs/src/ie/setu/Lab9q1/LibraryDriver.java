package ie.setu.Lab9q1;

public class LibraryDriver {

	public static void main(String[] args) {
		LibraryItem[] libraryItems = new LibraryItem[2];
		libraryItems[0] = new CD();
		libraryItems[1] = new Book();
		
		System.out.println(((CD)libraryItems[0]).calculatePrice());
		System.out.println(((Book)libraryItems[1]).calculatePrice());
	}

}

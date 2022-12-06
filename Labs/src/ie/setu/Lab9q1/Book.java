package ie.setu.Lab9q1;

public class Book extends LibraryItem implements LoanItem{
	private String author;
	private String title;
	private int numPages;

	public Book() {
		super();
		author = "";
		title = "";
		numPages = 0;
	}
	
	public Book(String type, String iD, String author, String title, int numPages) {
		super(type, iD);
		this.author = author;
		this.title = title;
		this.numPages = numPages;
	}



	@Override
	public String calculatePrice() {
		return "30.0";
	}
	
	
}

package ie.setu.Lab9q1;

public class CD extends LibraryItem implements LoanItem{
	private String band;
	private String title;
	private int numTracks;
	
	public CD() {
		super();
		band = "";
		title = "";
		numTracks = 0;
	}
	
	public CD(String type, String iD, String band, String title, int numTracks) {
		super(type, iD);
		this.band = band;
		this.title = title;
		this.numTracks = numTracks;
	}


	@Override
	public String calculatePrice() {
		return "15.0";
	}
}

package ie.setu.Lab15;

public class Verifier {
	//attributes
	private MyOutOfRangeException exception;
	private MyInvalidPasswordException passwordException;
	
	//constructors
	public Verifier() {
		exception = new MyOutOfRangeException();
	}
	
	//methods
	public void verifyIntRange(int value, int low, int high) {
		if (value < low || value > high) {
			System.out.println("Exception: " + exception.outOfRange());
		}
		else {
			System.out.println("Number in range!!!");
		}
	}
	
	public void verifyPasswordStrength(String password) {
		if (password.length() < 8) {
			System.out.println("Exceprion: " + passwordException.invalidPassword());
		}
		else {
			System.out.println("Good password");
		}
	}
}

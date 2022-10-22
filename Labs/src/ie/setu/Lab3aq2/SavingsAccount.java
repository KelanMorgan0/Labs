package ie.setu.Lab3aq2;

public class SavingsAccount {
	//attributes
	private int accountID;
	private static int accountCount = 0;
	private static double annualInterestRate;
	private double savingsBalance;
	
	//constructors
	public SavingsAccount() {
		accountCount++;
		savingsBalance = 0.0;
		accountID = accountCount;
	}
	
	public SavingsAccount(double balance) {
		savingsBalance = balance;
		accountCount++;
		accountID = accountCount;
	}
	
	//setters and getters
	public void setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}
	public double getSavingsBalance() {
		return savingsBalance;
	}
	
	public int getAccountID() {
		return accountID;
	}
	
	//toString method
	public String toString() {
		return "Account ID:\t" + accountID + "\nSavings Balance:\t" + savingsBalance;
	}
	
	//methods
	public void calculateMonthlyInterest() {
		savingsBalance += (annualInterestRate * savingsBalance) / 12;;
	}
	
	public static void modifyInterestRate(double interestRate) {
		annualInterestRate = interestRate;
	}
}

package ie.setu.Lab3aq2;

public class Bank {

	public static void main(String[] args) {
		//initialize savings accounts
		SavingsAccount saver1 = new SavingsAccount(2000.0);
		SavingsAccount saver2 = new SavingsAccount(3000.0);
		
		//set annual interest rate
		SavingsAccount.modifyInterestRate(0.04);
		
		//calculate the monthly interest
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		
		//print the balances of the savers
		System.out.println(saver1.toString());
		System.out.println(saver2.toString());
		
		//set annual interest rate
		SavingsAccount.modifyInterestRate(0.05);
				
		//calculate the monthly interest
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
				
		//print the balances of the savers
		System.out.println(saver1.toString());
		System.out.println(saver2.toString());
	}

}

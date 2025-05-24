package bankpack;

public class BankClass implements Bank {
	int TotalAmount=10000;
	public void deposite(int depositeBalance) {
		System.out.println("Amount deposited: " + depositeBalance);
		TotalAmount += depositeBalance;
	}
	
	public void withdraw(int withdrawBalance) {
		System.out.println("Withdrawing amount: " + withdrawBalance);
		TotalAmount -= withdrawBalance;
	}
	
	public void showBalance() {
		System.out.println("Total amount in account: " + TotalAmount);
	}
}

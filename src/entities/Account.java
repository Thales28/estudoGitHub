package entities;

public class Account {
	private int accountNumber;
	private String userName;
	private double value;
	
	public Account(int accountNumber, String userName) {
		this.accountNumber = accountNumber;
		this.userName = userName;
	}
	
	public Account(int accountNumber, String userName, double value) {
		this.accountNumber = accountNumber;
		this.userName = userName;
		deposit(value);
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public double getValue() {
		return value;
	}
	
	public void deposit(double value) {
		this.value += value;
	}
	
	public void withdraw(double value) {
		this.value -= value + 5;
	}
	
	public String toString() {
		return "Account "
				+ getAccountNumber()
				+ ", Holder: "
				+ getUserName()
				+ ", Balance: $"
				+ String.format("%.2f", getValue());

	}
}

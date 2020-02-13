package entities;

public class Account {
	private int number;
	private String holder;
	private double balance;
	private double withdrawLimit;
	
	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
		this.withdrawLimit = 99999.99;
	}
	
	public Account(int number, String holder, double balance) throws Exception {
		if(balance < 0) {
			throw new Exception ("Negative balance");
		}
		this.number = number;
		this.holder = holder;
		deposit(balance);
		this.withdrawLimit = 99999.99;
	}

	public Account (int number, String holder, double balance, double withdrawLimit) throws Exception {
		if(balance < 0) {
			throw new Exception ("Negative balance");
		}
		if(withdrawLimit < 0) {
			throw new Exception ("Negative withdraw limit");
		}
		this.number = number;
		this.holder = holder;
		deposit(balance);
		this.withdrawLimit = withdrawLimit;
	}
	
	public int getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}
	
	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}
	
	public double getWithdrawLimit() {
		return withdrawLimit;
	}
	
	public void setWithdrawLimit(double withdrawLimit) throws Exception {
		if(withdrawLimit < 0) {
			throw new Exception ("Negative withdraw limit");
		}
		this.withdrawLimit = withdrawLimit;
	}
	
	public void deposit(double value) throws Exception {
		if(value < 0) {
			throw new Exception ("Negative value");
		}
		this.balance += value;
	}
	
	public void withdraw(double value) throws Exception {
		if(value < 0) {
			throw new Exception ("Negative value");
		}

		else if (value > withdrawLimit) {
			throw new Exception("Withdraw error: The amount exceeds withdraw limit");
		}
		
		else if(value > balance) {
			throw new Exception("Withdraw error: Not enough balance");
		}
		this.balance -= value;
	}
	
	public String toString() {
		return "Account "
				+ getNumber()
				+ ", Holder: "
				+ getHolder()
				+ ", Balance: $"
				+ String.format("%.2f", getBalance());

	}
}
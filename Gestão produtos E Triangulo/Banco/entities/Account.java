package entities;

public class Account {

	private byte number;
	private String holder;
	private float balance;
	
	public Account(byte number, String holder) {
		this.number = number;
		this.holder = holder;
	}

	public Account(byte number, String holder, float initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}

	public byte getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public float getBalance() {
		return balance;
	}

	public void deposit(float amount) {
		balance += amount;
	}
	
	public void withdraw(float amount) {
		balance -= amount + 5.0;
	}
	
	public String toString() {
		return "Account "
				+ number
				+ ", Holder: "
				+ holder
				+ ", Balance: $ "
				+ String.format("%.2f", balance);
	}
}
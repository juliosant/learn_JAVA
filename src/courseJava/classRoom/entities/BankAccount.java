package courseJava.classRoom.entities;

public class BankAccount {
	
	private int number;
	private String holder;
	private double balance;
	
	public BankAccount(int number, String holder) {
		this.number = number;
		this.holder = holder;
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
	
	public void deposit(double deposit) {
		this.balance += deposit;
	}
	
	public void withdraw(double withdraw) {
		balance -= (withdraw + 5);
	}
	
	public String toString() {
		return "\n\nAccount Data:"
		+"\nAccount: " + String.format("%05d", getNumber())
		+ "\nHolder: " + getHolder()
		+ "\nBalance: " + String.format("$ %.2f", getBalance());
	}
}

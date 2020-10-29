package courseJava.classRoom.entities;

public final class SavingsAccount extends Account{
	private Double intersestRate;
	
	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double intersestRate) {
		super(number, holder, balance);
		this.intersestRate = intersestRate;
	}

	public Double getIntersestRate() {
		return intersestRate;
	}

	public void setIntersestRate(Double intersestRate) {
		this.intersestRate = intersestRate;
	}
	
	public void updateBalace() {
		balance += balance * intersestRate;
	}
	
	@Override
	public final void withdraw(Double amount) {
		balance -= amount;
	}
	
}

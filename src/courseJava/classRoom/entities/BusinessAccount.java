package courseJava.classRoom.entities;

public class BusinessAccount extends Account {
	private Double loanLimit;
	
	public BusinessAccount() {
		super();
	}
	

	
	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		
		this.loanLimit = loanLimit;
	}


	public void loan(Double amount) {
		if(loanLimit >= amount) {
			balance += amount - 10.0; // variable "balance" is protected
		}
		
	}
	
	@Override
	public final void withdraw(Double amount) {
		super.withdraw(amount); //super is superclass
		balance -= 2.00;
	}
}

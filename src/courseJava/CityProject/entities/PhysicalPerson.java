package courseJava.CityProject.entities;

public class PhysicalPerson extends Person{
	private Double healthSpending; //gasto com saude.
	
	public PhysicalPerson() {
		
	}

	public PhysicalPerson(String name, Double annualIncome, Double healthSpending) {
		super(name, annualIncome);
		this.healthSpending = healthSpending;
	}

	public Double getHealthSpeding() {
		return healthSpending;
	}

	public void setHealthSpeding(Double healthSpending) {
		this.healthSpending = healthSpending;
	}
	
	@Override
	public final Double incomeTax() {
		Double incomeTax = 0.0;
		
		if(annualIncome < 20000) {
			incomeTax += annualIncome * 0.15;
		}
		else {
			incomeTax += annualIncome * 0.25;
		}
		
		if(healthSpending > 0) {
			incomeTax -= healthSpending/2;
		}
		return incomeTax;
	}
}

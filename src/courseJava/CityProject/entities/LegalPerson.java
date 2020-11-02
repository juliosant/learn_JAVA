package courseJava.CityProject.entities;

public class LegalPerson extends Person{
	
	private Integer qtyEmployees;
	
	public LegalPerson() {
		
	}
	
	public LegalPerson(String name, Double annualIncome, Integer qtyEmployees) {
		super(name, annualIncome);
		this.qtyEmployees = qtyEmployees;
	}
	
	public Integer getQtyEmployees() {
		return qtyEmployees;
	}
	
	public void setQtyEmployees(Integer qtyEmployees) {
		this.qtyEmployees = qtyEmployees;
	}
	
	@Override
	public final Double incomeTax() {
		Double incomeTax = 0.0;
		if(qtyEmployees > 10) {
			incomeTax += annualIncome * 0.14;
		}
		else {
			incomeTax += annualIncome * 0.16;
		}
		return incomeTax;
	}
}

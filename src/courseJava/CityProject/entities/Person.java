package courseJava.CityProject.entities;

public abstract class Person {
	protected String name;
	protected Double annualIncome;
	
	public Person() {
		
	}

	public Person(String nome, Double annualIncome) {
		this.name = nome;
		this.annualIncome = annualIncome;
	}

	public String getNome() {
		return name;
	}

	public void setNome(String nome) {
		this.name = nome;
	}

	public Double getAnnualIncome() {
		return annualIncome;
	}

	public void setAnnualIncome(Double annualIncome) {
		this.annualIncome = annualIncome;
	}
	
	public abstract Double incomeTax();
	
	public String toString() {
		return name + ": $"+String.format("%.2f", incomeTax()); 
	}
}

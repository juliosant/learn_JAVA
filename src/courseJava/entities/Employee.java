package courseJava.entities;

public class Employee {
	public String name;
	public double glossSalary;
	public  double tax;
	
	public Employee() {
		
	}
	
	public Employee(String name, double glossSalary, double tax) {
		this.name = name;
		this.glossSalary = glossSalary;
		this.tax = tax;
	}
	
	public void increaseSalary(double percent) { 
		glossSalary += glossSalary * (percent/100);
		System.out.printf("Updated data: "+ this.name + 
				", $ %.2f", this.showNetSalary(this.glossSalary));
	}
	
	public String toString() {
		return "Employee:" + name 
				+ ", $ " + String.format("%.2f", this.showNetSalary(glossSalary));
	}
	
	public double showNetSalary(double glossSalary) {
		double netSalary = glossSalary-tax;
		return netSalary;
	}
}

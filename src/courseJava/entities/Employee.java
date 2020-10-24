package courseJava.entities;

public class Employee {
	/*
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
	*/
	
	//EMPREGADO PRIVADO
	private int id;
	private String name;
	private double salary;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String toString() {
		return "\nId: " + id
				+ "\nName: " + name
				+ "\nSalary: $ " + String.format("%.2f", salary);
	}
	
	
	
	
}

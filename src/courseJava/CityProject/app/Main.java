package courseJava.CityProject.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import courseJava.CityProject.entities.LegalPerson;
import courseJava.CityProject.entities.Person;
import courseJava.CityProject.entities.PhysicalPerson;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Person> persons = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers:");
		int qtyPayers = sc.nextInt();
		
		for(int i=1; i<=qtyPayers; i++) {
			System.out.println("tax payer #"+i+" data:");
			System.out.print("Individual or company (i/c)?");
			char payerOption = sc.next().toLowerCase().charAt(0);
			
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Annual imcome: ");
			Double annualIncome = sc.nextDouble();
			
			if(payerOption == 'i') {
				System.out.print("Health Spending: ");
				Double healthSpending = sc.nextDouble();
				persons.add(new PhysicalPerson(name, annualIncome, healthSpending));
				
			}
			else if(payerOption == 'c') {
				System.out.print("Quantity employees: ");
				Integer qtyEmployees = sc.nextInt();
				persons.add(new LegalPerson(name, annualIncome, qtyEmployees));
			}
			System.out.println();
		}
		
		Double totalTax = 0.0;
		for(Person person : persons) {
			System.out.println(person);
			totalTax += person.incomeTax();
		}
		
		System.out.println("\nTOTAL TAXES: " + String.format("%.2f", totalTax));
		sc.close();
	}

}

package courseJava.otherCompanyProject.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import courseJava.otherCompanyProject.entities.Employee;
import courseJava.otherCompanyProject.entities.OutsourceEmployee;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		/*
		Employee emp0 = new Employee("Jose", 48, 3.40);
		Employee emp1 = new OutsourceEmployee("Antonio", 48, 3.40, 50.00);
		
		System.out.println(String.format("%.2f", emp0.payment()));
		System.out.println(String.format("%.2f", emp1.payment()));
		*/
		List<Employee> employees = new ArrayList<>();
		
		System.out.println("Enter the number of employees to be created:");
		int numberEmp = sc.nextInt();
		
		sc.nextLine();
		for(int i=0; i < numberEmp; i++) {
			
			System.out.println("\nEnter employee #" + (i+1)+ " data:");
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Worked hours: ");
			Integer hours = sc.nextInt();
			System.out.print("Value per hour: ");
			Double valuePerHour = sc.nextDouble();
			
			sc.nextLine();
			System.out.println("Is Outsource Employee?: ");
			char answer = sc.nextLine().toUpperCase().charAt(0);
			
			Employee employee;
			if(answer == 'S') {
				System.out.print("How many the additional charge?:");
				Double addCharge = sc.nextDouble();
				
				employee = new OutsourceEmployee(name, hours, valuePerHour, addCharge);
				sc.nextLine();
		
			}
			else {
				employee = new Employee(name, hours, valuePerHour);
			}
			
			employees.add(employee);
			
		}
		
		for(Employee employee : employees) {
			System.out.println(employee);
		}
		sc.close();
				
	}

}

package courseJava.companyProject.app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import courseJava.companyProject.entities.Department;
import courseJava.companyProject.entities.HourContract;
import courseJava.companyProject.entities.Worker;
import courseJava.companyProject.enums.WorkerLevel;

public class Main{
	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		System.out.print("Enter Department's name: ");
		String nameDepartment = sc.next();
		Department department = new Department(nameDepartment);
		
		System.out.println("Enter worker date:");
		//Nome
		System.out.print("Name: ");
		String nameWorker = sc.next();
		//Nível
		System.out.print("Level: ");
		WorkerLevel level = WorkerLevel.valueOf(sc.next());
		//Salário
		System.out.print("Base salary: ");
		Double baseSalary = sc.nextDouble();
		//Contratos
		System.out.println("How many contracts to this worker?");
		int qtyContracts = sc.nextInt();
		
		Worker worker = new Worker(nameWorker, level, baseSalary, department);
		
		for(int i = 0; i < qtyContracts; i++) {
			System.out.println("\nEnter contract #"+(i+1) +" data:");
			System.out.print("Date (DD/MM/YYYY): ");
			Date date = sdf.parse(sc.next());
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			System.out.print("Duration: ");
			int hours = sc.nextInt();
			HourContract contract = new HourContract(date, valuePerHour, hours);
			worker.addContract(contract);
			
		}
		
		System.out.println("Enter month and year to calculate income:");
		String monthAndYear = sc.next();
		//pegar os dois primeiros digitos da String e comnvertê-los em inteiros
		int month = Integer.parseInt(monthAndYear.substring(0, 2)); 
		int year = Integer.parseInt(monthAndYear.substring(3));
		
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Income: " + String.format("%.2f", worker.income(year, month)));
		sc.close();
		
	}
}

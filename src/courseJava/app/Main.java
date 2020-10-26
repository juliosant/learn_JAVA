package courseJava.app;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import courseJava.classRoom.enums.OrderStatus;

//import courseJava.entities.BankAccount;

//import courseJava.basic.ProductPrivate;

//import courseJava.entities.Triangle;
//import courseJava.entities.Product;
import courseJava.entities.Employee;
//import courseJava.entities.Student;
//import courseJava.entities.Retangle;
//import courseJava.utilitaries.Coin;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// TRIÂNGULO
		/*
		 * Triangle triangle0 = new Triangle(); System.out.println("\nT0: ");
		 * triangle0.a = sc.nextDouble(); triangle0.b = sc.nextDouble(); triangle0.c =
		 * sc.nextDouble(); triangle0.showArea(triangle0.areaTriangle());
		 * 
		 * Triangle triangle1 = new Triangle(); System.out.println("\nT1: ");
		 * triangle1.a = sc.nextDouble(); triangle1.b = sc.nextDouble(); triangle1.c =
		 * sc.nextDouble();
		 * 
		 * triangle1.showArea(triangle1.areaTriangle());
		 */

		// PRODUTO
		/*
		 * Product product = new Product();
		 * System.out.println("Enter the attributes of your product: "); product.name =
		 * sc.next(); product.price = sc.nextDouble(); product.quantity = sc.nextInt();
		 * 
		 * System.out.println(product); //toString configurada
		 * 
		 * //System.out.println("\n\nProduct: " + product.name + "\nPrice: " +
		 * product.price + "\nQuantity: " + product.quantity);
		 * 
		 * //System.out.printf("The total value of all products in Stock is: %.2f\n",
		 * product.totalValueInStock());
		 * 
		 * System.out.println("\nEnter the number of products to be added in Stock: ");
		 * product.addProducts(sc.nextInt());
		 * 
		 * System.out.
		 * println("\nEnter the number of  products to be removed in StockS: ");
		 * product.removeProducts(sc.nextInt());
		 * 
		 * System.out.println("\n\n\n" + product); //toString configurada
		 */

		// EMPREGADO
		/*
		 * Employee employee = new Employee(); employee.name = sc.next();
		 * employee.glossSalary = sc.nextDouble(); employee.tax = sc.nextDouble();
		 * 
		 * System.out.println(employee); employee.increaseSalary(10.0);
		 * 
		 */

		// ALUNO
		/*
		 * Student student = new Student(); student.name = sc.next(); student.grade0 =
		 * sc.nextDouble(); student.grade1 = sc.nextDouble(); student.grade2 =
		 * sc.nextDouble();
		 * 
		 * student.studentSituation();
		 */

		// RETÂNGULO
		/*
		 * Retangle retangle = new Retangle(); System.out.println("RETANGLE:");
		 * retangle.width = sc.nextDouble(); retangle.height = sc.nextDouble();
		 * 
		 * System.out.println("AREA: " + retangle.area());
		 * System.out.println("PERIMETER: "+ retangle.perimeter());
		 * System.out.println("DIAGONAL: " + retangle.diagonal());
		 */
		// DOLLAR-REAL (ESTÁTICOS)
		/*
		 * System.out.println("WHATS IS THE DOLLAR PRICE? "); double priceDollar =
		 * sc.nextDouble(); System.out.println("HOW MANY DOLLARS WILL BE  BOUGHT? ");
		 * double dollar = sc.nextDouble();
		 * 
		 * System.out.printf("AMOUNT TO BE PAID IN REAIS = %.2f",
		 * Coin.convertInReal(priceDollar, dollar));
		 */

		// PRODUTO ENCAPSULADO
		/*
		 * ProductPrivate product = new ProductPrivate();
		 * System.out.println("Enter the attributes of your product: ");
		 * product.setName(sc.next()); product.setPrice(sc.nextDouble());
		 * 
		 * System.out.println(product); //toString configurada
		 * 
		 * //System.out.println("\n\nProduct: " + product.name + "\nPrice: " +
		 * product.price + "\nQuantity: " + product.quantity);
		 * 
		 * //System.out.printf("The total value of all products in Stock is: %.2f\n",
		 * product.totalValueInStock());
		 * 
		 * System.out.println("\nEnter the number of products to be added in Stock: ");
		 * product.addProducts(sc.nextInt());
		 * 
		 * System.out.
		 * println("\nEnter the number of  products to be removed in StockS: ");
		 * product.removeProducts(sc.nextInt());
		 * 
		 * System.out.println("\n\n\n" + product); //toString configurada
		 */

		// CONTA BANCÁRIA
		/*
		 * System.out.println("ACCOUNT NUMBER: "); int number = sc.nextInt();
		 * sc.nextLine(); System.out.println("HOLDER: "); String name = sc.nextLine();
		 * 
		 * BankAccount account = new BankAccount(number, name);
		 * 
		 * System.out.println("IS THERE AN INITIAL DEPOSIT?[Y/N]"); char answer =
		 * sc.next().charAt(0);
		 * 
		 * if(answer == 'Y' || answer == 'y') { account.deposit(sc.nextDouble());
		 * System.out.println(account); } else if(answer == 'N' || answer == 'n') {
		 * System.out.println(account); } else {
		 * System.out.println("INVALID OPTION! DEPOSIT WILL NOT BE DONE!"); }
		 * System.out.println("\n\nENTER A DEPOSIT VALUE: ");
		 * account.deposit(sc.nextDouble()); System.out.println(account);
		 * 
		 * System.out.println("\n\nENTER A WITHDRAW VALUE: ");
		 * account.withdraw(sc.nextDouble());
		 * 
		 * System.out.println(account);
		 */

		// Hotel dos Estudantes
		/*
		 * System.out.println("How many Students, please?"); int n = 0; while (n <= 0 ||
		 * n > 10) {
		 * System.out.println("Enter with values in the range (1-10), please?"); n =
		 * sc.nextInt(); }
		 * 
		 * Student[] bedrooms = new Student[10];
		 * 
		 * for (int i = 0; i<n; i++) { System.out.println("Number room: "); int room =
		 * sc.nextInt(); System.out.println("Students" + (i+1)); bedrooms[room] = new
		 * Student(); System.out.println("Name: "); bedrooms[room].name = sc.next();
		 * System.out.println("Email: "); bedrooms[room].email = sc.next();
		 * bedrooms[room].bedroom = room;
		 * 
		 * }
		 * 
		 * int j = 0; for (Student room: bedrooms) { if(room != null)
		 * System.out.println("\n:::::::::::::Rent " + (j+1) + "::::::::::::: " + room);
		 * j += 1; }
		 */

		// ENCAPSULAMENTO - EMOREGADOS
		/*
		 * List<Employee> employees = new ArrayList<Employee>();
		 * 
		 * System.out.println("How many employees do you want to add?:"); int qty =
		 * sc.nextInt();
		 * 
		 * int cont = 1; while (qty > 0) { Employee employee = new Employee();
		 * System.out.println("\nEmployee #" + cont); System.out.println("Id:");
		 * employee.setId(sc.nextInt()); System.out.println("Name"); sc.nextLine();
		 * employee.setName(sc.nextLine()); System.out.println("Initial Salary");
		 * employee.setSalary(sc.nextDouble());
		 * 
		 * employees.add(employee);
		 * 
		 * cont += 1; qty -= 1; }
		 * 
		 * System.out.println("Enter the employee id that will have salary increase: ");
		 * int id = sc.nextInt();
		 * 
		 * 
		 * 
		 * Employee aux = employees.stream().filter(x -> x.getId() ==
		 * id).findFirst().orElse(null);
		 * 
		 * if(aux != null) { System.out.println("Enter the percentage: "); double
		 * percent = (sc.nextDouble()) / 100; for (Employee employee : employees) { if
		 * (id == employee.getId()) { double newSalary = employee.getSalary() +
		 * (employee.getSalary() * percent); employee.setSalary(newSalary); } } }
		 * 
		 * else { System.out.println("This id does not exist"); }
		 * 
		 * for (Employee employee : employees) { System.out.println(employee); }
		 */
		
		//MATRIZ
		/*
		System.out.println("Enter how many rows your matrix will have: ");
		int m = sc.nextInt();

		System.out.println("Enter how many columns your matrix will have: ");
		int n = sc.nextInt();

		int[][] matrix = new int[m][n];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print("Row: " + i + " and Column: " + j + ": ");
				matrix[i][j] = sc.nextInt();
				System.out.print("\n");
			}
		}

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print("{" + matrix[i][j] + "} ");
			}
			System.out.print("\n");
		}

		System.out.println("Type a matrix number to find Adjacents numbers:");
		int x = sc.nextInt();

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == x) {
					if (i > 0) {
						System.out.println("Top: " + matrix[i - 1][j]);
					}
					if (i < matrix[i].length-1) {
						System.out.println("Button: " + matrix[i + 1][j]);
					}
					if(j > 0) {
						System.out.println("Left: " + matrix[i][j - 1]);
					}
					if(j <	 matrix[j].length-1) {
						System.out.println("Right: " + matrix[i][j + 1]);
					}
				}
				
			}
		}
		*/

	}
}

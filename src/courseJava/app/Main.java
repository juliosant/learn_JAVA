package courseJava.app;

import java.util.Locale;
import java.util.Scanner;

//import courseJava.entities.Triangle;
//import courseJava.entities.Product;
//import courseJava.entities.Employee;
//import courseJava.entities.Student;
//import courseJava.entities.Retangle;
import courseJava.utilitaries.Coin;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//TRIÂNGULO
		/*
		Triangle triangle0 = new Triangle();
		System.out.println("\nT0: ");
		triangle0.a = sc.nextDouble();
		triangle0.b = sc.nextDouble();
		triangle0.c = sc.nextDouble();
		triangle0.showArea(triangle0.areaTriangle());
		
		Triangle triangle1 = new Triangle();
		System.out.println("\nT1: ");
		triangle1.a = sc.nextDouble();
		triangle1.b = sc.nextDouble();
		triangle1.c = sc.nextDouble();
		
		triangle1.showArea(triangle1.areaTriangle());		
		*/
		
		//PRODUTO
		/*
		Product product = new Product();
		System.out.println("Enter the attributes of your product: ");
		product.name = sc.next();
		product.price = sc.nextDouble();
		product.quantity = sc.nextInt();
		
		System.out.println(product); //toString configurada
		
		//System.out.println("\n\nProduct: " + product.name + "\nPrice: " + product.price + "\nQuantity: " + product.quantity);
		
		//System.out.printf("The total value of all products in Stock is: %.2f\n", product.totalValueInStock());
		
		System.out.println("\nEnter the number of products to be added in Stock: ");
		product.addProducts(sc.nextInt());
		
		System.out.println("\nEnter the number of  products to be removed in StockS: ");
		product.removeProducts(sc.nextInt());
		
		System.out.println("\n\n\n" + product); //toString configurada
		*/
		
		//EMPREGADO
		/*
		Employee employee = new Employee();
		employee.name = sc.next();
		employee.glossSalary = sc.nextDouble();
		employee.tax = sc.nextDouble();
		
		System.out.println(employee);
		employee.increaseSalary(10.0);
		
		*/
		
		//ALUNO
		/*
		Student student = new Student();
		student.name = sc.next();
		student.grade0 = sc.nextDouble();
		student.grade1 = sc.nextDouble();
		student.grade2 = sc.nextDouble(); 
		
		student.studentSituation();
		*/
		
		//RETÂNGULO
		/*
		Retangle retangle = new Retangle();
		System.out.println("RETANGLE:");
		retangle.width = sc.nextDouble();
		retangle.height = sc.nextDouble();
		
		System.out.println("AREA: " + retangle.area());
		System.out.println("PERIMETER: "+ retangle.perimeter());
		System.out.println("DIAGONAL: " + retangle.diagonal());
		*/
		//DOLLAR-REAL (ESTÁTICOS)
		System.out.println("WHATS IS THE DOLLAR PRICE? ");
		double priceDollar = sc.nextDouble();
		System.out.println("HOW MANY DOLLARS WILL BE  BOUGHT? ");
		double dollar = sc.nextDouble();
		
		System.out.printf("AMOUNT TO BE PAID IN REAIS = %.2f", Coin.convertInReal(priceDollar, dollar));
		sc.close(); 
	}
}

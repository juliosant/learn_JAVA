package courseJava.shoppingProject.app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import courseJava.shoppingProject.entities.Client;
import courseJava.shoppingProject.entities.Order;
import courseJava.shoppingProject.entities.OrderItem;
import courseJava.shoppingProject.entities.Product;
import courseJava.shoppingProject.enums.OrderStatus;

public class Main {
	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Order order = new Order();
		
		Client client = new Client();
		System.out.println("Enter client data:");
		System.out.print("Name: ");
		client.setName(sc.nextLine());
		System.out.print("Email: ");
		client.setEmail(sc.nextLine());
		System.out.print("Birth Date: ");
		client.setBirthDate(sdf.parse(sc.nextLine()));
		order.setClient(client);
		
		
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		OrderStatus os = OrderStatus.valueOf(sc.nextLine());
		order.setStatus(os);
		
		System.out.print("How many items to this order?");
		int qtyItems = sc.nextInt();
		
		
		for (int i = 0; i < qtyItems; i++) {
			System.out.println("Enter item #" + (i+1) + " data:");	
			System.out.print("Product name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Product price: ");
			Double price = sc.nextDouble();
			System.out.print("Quantity: ");
			Integer quantity = sc.nextInt();
			
			Product product = new Product(name, price);
			OrderItem oi = new OrderItem(quantity, price, product);
			
			order.addItem(oi);
			
		}
		System.out.println();
		System.out.println(order);
		
		sc.close();
	}
}

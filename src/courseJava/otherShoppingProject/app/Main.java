package courseJava.otherShoppingProject.app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import courseJava.otherShoppingProject.entities.ImportedProduct;
import courseJava.otherShoppingProject.entities.Product;
import courseJava.otherShoppingProject.entities.UsedProduct;

public class Main {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		List<Product> products = new ArrayList<>();

		System.out.println("Enter the number products: ");
		int numberProd = sc.nextInt();

		sc.nextLine();
		for (int i = 0; i < numberProd; i++) {
			System.out.println("\nProduct #" + (i + 1) + " data: ");
			System.out.print("Common, used or imported (c/u/i)?: ");
			char answer = sc.nextLine().toLowerCase().charAt(0);
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Price: ");
			Double price = sc.nextDouble();
			sc.nextLine();
			
			Product prd;
			if (answer == 'c') {
				prd = new Product(name, price);
				products.add(prd);

			} else if (answer == 'u') {
				System.out.print("Manufacture date: ");
				//String date = ;
				Date manufactureDate = sdf.parse(sc.nextLine());
				prd = new UsedProduct(name, price, manufactureDate);
				products.add(prd);

			} else if (answer == 'i') {
				System.out.print("Custom fee: ");
				Double customFee = sc.nextDouble();
				prd = new ImportedProduct(name, price, customFee);
				products.add(prd);
				sc.nextLine();
			}
		}
		
		System.out.println();
		for(Product product : products) {
			System.out.println(product.priceTag());
		}
		sc.close();
	}

}

package courseJava.entities;

public class Product {
	public String name;
	public double price;
	public int quantity;
	
	public Product() {
		
	}
	
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
		System.out.println("Now, you've "+ this.quantity + " " + name + "(s) units");
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
		System.out.println("Now, you've "+ this.quantity + " " + name + "(s) units");
	}
	
	public String toString() {
		return "\nName Product: "+ name 
				+ "\nPrice: $ " + String.format("%.2f", price) 
				+ "\nQuantity: " + quantity + " units"
				+ "\nTotal value of pruducts in Stock: $" + String.format("%.2f", totalValueInStock());
	}
}

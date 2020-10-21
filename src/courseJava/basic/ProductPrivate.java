package courseJava.basic;

public class ProductPrivate {
	private String name;
	private double price;
	private int quantity;
	
	public ProductPrivate() {
		
	}
	
	public ProductPrivate(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public double totalValueInStock() {
		return getPrice() * getQuantity();
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
		System.out.println("Now, you've "+ getQuantity() + " " + getName() + "(s) units");
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
		System.out.println("Now, you've "+ getQuantity() + " " + getName() + "(s) units");
	}
	
	public String toString() {
		return "\nName Product: "+ getName() 
				+ "\nPrice: $ " + String.format("%.2f", getPrice()) 
				+ "\nQuantity: " + getQuantity() + " units"
				+ "\nTotal value of pruducts in Stock: $" + String.format("%.2f", totalValueInStock());
	}
}
//OBS: 
		/*
		 * public - pode acessa atributos da casse de pacotes diferentes,
		 * private - pode acessar atributos/métodos desde que estejam no mesmo pacote. 
		   Caso contrário, precisa de métodos de encapsulamento para acessar atributos
		 * protected - pode acessar atributos/metodos apenas do mesmo pacot ou subclasses 
		   de pacotes diferentes 
		*/
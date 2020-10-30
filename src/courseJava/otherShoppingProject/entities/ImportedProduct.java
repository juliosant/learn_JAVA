package courseJava.otherShoppingProject.entities;

public class ImportedProduct extends Product{
	private Double customFee;
	
	public ImportedProduct() {
		super();
	}

	public ImportedProduct(String name, Double price, Double customFee) {
		super(name, price);
		this.customFee = customFee;
	}

	public Double getCustomFee() {
		return customFee;
	}

	public void setCustomFee(Double customFee) {
		this.customFee = customFee;
	}
	
	public Double totalPrice() {
		return price + customFee;
	}
	
	public final String priceTag() {
		StringBuilder sb = new StringBuilder();
		sb.append(name);
		sb.append(" $");
		sb.append(String.format("%.2f", totalPrice()));
		sb.append(" (Custom fee: $");
		sb.append(String.format("%.2f", customFee)+")" );
		
		
		return sb.toString();
	}
	
}

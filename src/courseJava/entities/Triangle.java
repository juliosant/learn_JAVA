package courseJava.entities;

public class Triangle {
	public double a;
	public double b;
	public double c;
	
	public Triangle() {
		
	}
	
	public Triangle(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double areaTriangle() {
		double p = (a+b+c)/2;
		
		return Math.sqrt(p*(p-a)*(p-b)*(p-c));
		
	}
	
	public void showArea(double area) {
		System.out.printf("AREA: %.4f",area);
	}
}

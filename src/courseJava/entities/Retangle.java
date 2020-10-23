package courseJava.entities;

public class Retangle {
	public double width;
	public double height;
	
	public Retangle() {
		
	}
	
	public double area() {
		return width * height;
	}
	
	public double perimeter() {
		return 2*width + 2*height;
	}
	
	public double diagonal() {
		return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
	}
	
	public String toString() {
		return "\nWidth: " + String.format("%.1f\n", width) +
				"Height: " + String.format("%.1f", height);
	}
}


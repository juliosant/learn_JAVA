package courseJava.classRoom.utilitaries;

public class Calculator {
	public static final double PI = 3.14159; //final and upper case -> constant 
	
	public static double circumference(double radius) {
		return 2*PI*radius;
	}
	
	public static double volume(double radius) {
		return 4 * PI * Math.pow(radius, 3)/3;
	}
}

package courseJava.classRoom;

import java.util.Locale;
import java.util.Scanner;

public class ExerciseTriangle {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//TRIÂNGULO 1
		System.out.println("T1: ");
		double tl1 = sc.nextDouble();
		double tl2 = sc.nextDouble();
		double tl3 = sc.nextDouble();
		double areaTl = areaTriangle(tl1, tl2, tl3);
		System.out.printf("%.4f",areaTl);
		
		System.out.println("\n");
		
		//TRIÂNGULO 2
		System.out.println("T2: ");
		double tr1 = sc.nextDouble();
		double tr2 = sc.nextDouble();
		double tr3 = sc.nextDouble();
		double areaTr = areaTriangle(tr1, tr2, tr3);
		System.out.printf("%.4f",areaTr);
		
		System.out.println("\n");
		
		String higherT = higherTriangle(areaTl, areaTr);
		System.out.println("HIGHER TRIANGLE: " +  higherT);
		
		sc.close();

	}
	
	public static double areaTriangle(double a, double b, double c) {
		double p = (a+b+c)/2;
		double area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
		
		return area;
	}
	
	public static String higherTriangle(double t1, double t2) {
		if(t1>t2) {
			return "T1";
		}
		else if(t2>t1) {
			return "T2";
		}
		else {
			return "Equals";
		}
	}
}

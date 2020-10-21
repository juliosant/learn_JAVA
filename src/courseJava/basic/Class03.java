package courseJava.basic;

import java.util.Locale;
import java.util.Scanner;

public class Class03 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// FUNÇÕES
		System.out.println("Digite 3 valores");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int higher = max(a, b, c);

		showHigher(higher);

		sc.close();

	}

	public static int max(int x, int y, int z) {
		if (x > y && x > z) {
			return x;
		} else if (y > z) {
			return y;
		} else {
			return z;
		}
	}

	public static void showHigher(int x) {

		System.out.println("---------\n" + "MAIOR: " + x + "\n---------");
	}
}

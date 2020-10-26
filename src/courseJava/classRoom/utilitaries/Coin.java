package courseJava.classRoom.utilitaries;

public class Coin {
	public static double convertInReal(double priceDollar, double dollar) {
		double real = priceDollar * dollar;
		return real += real*0.06;
	}
}

package courseJava.classRoom;

public class Day02 {
	public static void main(String[] args) {
		// DO-WHILE
		/*
		 * Locale.setDefault(Locale.US); Scanner sc = new Scanner(System.in);
		 * 
		 * double celsius, fahrenheit; char op;
		 * 
		 * do { System.out.println("DIGITE A TEMPERATURA EM CELSIUS: "); celsius =
		 * sc.nextDouble();
		 * 
		 * fahrenheit = (9*celsius/5)+32;
		 * 
		 * System.out.println("FAHRENHEIT = "+ fahrenheit);
		 * 
		 * System.out.println("DESEJA CONTINUAR?[s/n]"); op = sc.next().charAt(0); }
		 * while(op != 'n' || op == 'N');
		 * 
		 * sc.close();
		 */

		// BITWISE
		// 150 -> 10010110 | 120 -> 1111000
		// System.out.println(150 & 120); //result 16 -> 10000
		// System.out.println(150 | 120); //result 254 -> 11111110
		// System.out.println(150 ^ 120); //RESULT 238 -> 11101110

		// AND
		// 10010110 150
		// 1111000 120
		// 10000

		// OR
		// 10010110 150
		// 1111000 120
		// 11111110

		// XOR
		// 10010110 150
		// 1111000 120
		// 11101110

		// BINÁRIO P/ DECIMAL
		/*
		 * String bin0 = "11101110"; int num = Integer.parseInt(bin0, 2);
		 * System.out.println(num);
		 * 
		 * //DECIMAL P/ BINÁRIO //DECIMAL P/ BINÁRIO String bin1 =
		 * Integer.toBinaryString(16); //10000 System.out.println(bin1);
		 * 
		 * 
		 * int a = 0b100000; int n = 113;
		 * 
		 * String result = ((a & n) != 0)? "sim": "não"; System.out.println(result);
		 * 
		 * String bin = Integer.toBinaryString(89); System.out.println(bin);
		 */

		String word = " Olá Brasil ";
		word = word.toLowerCase(); // Minúscula
		System.out.println("-" + word + "-");

		word = word.toUpperCase(); // Maiúscula
		System.out.println("-" + word + "-");

		word = word.trim(); // Remover espaços dos cantos
		System.out.println("-" + word + "-");

		String wordTEMP0 = word.substring(4);
		System.out.println("-" + wordTEMP0 + "-");

		String wordTEMP1 = word.substring(4, 7);
		System.out.println("-" + wordTEMP1 + "-");

		word = word.replace("BRASIL", "ARGENTINA");
		System.out.println("-" + word + "-");

		System.out.println(word);
		int i = word.indexOf("ARGENTINA");
		int j = word.lastIndexOf("ARGENTINA");
		System.out.println(i);
		System.out.println(j);

		String[] vetor = word.split(" ");
		for (String x : vetor) {
			System.out.println(x);
		}
	}
}

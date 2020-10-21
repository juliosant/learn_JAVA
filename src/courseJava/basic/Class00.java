package courseJava.basic;

import java.util.Locale;
import java.util.Scanner;

public class Class00 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		/*
		 * int y = 32; System.out.println(y);
		 * 
		 * double x = 7.1573; Locale.setDefault(Locale.US); //Idioma da saida
		 * System.out.println(x); System.out.printf("%.2f%n", x);
		 * System.out.println("Olá mundo");
		 * 
		 * System.out.println("RESULTADO = " + x + " metros");
		 * System.out.printf("RESULATDO = " + "%.2f metros %n", x);
		 * 
		 * //receber valor decimal em uma variavel tipo int double a = 5.3; int b;
		 * 
		 * //Casting b = (int) a;
		 * 
		 * System.out.println(a + " : "+ b);
		 * 
		 * //Em java a divisão de um número inteiro //por outro inteiro, gera um número
		 * inteiro, //mesmo que seu valor correto deva ser um ponto //flutuante
		 * 
		 * int numerador = 5; int denominador = 2; double resultado;
		 * 
		 * //Problema resultado = 5/2; //2.0 System.out.println(resultado); //Solução ->
		 * Casting resultado = (double) 5/2; //2.5 System.out.println(resultado);
		 * 
		 */

		// ENTRADA DE DADOS - 1
		/*
		 * Locale.setDefault(Locale.US); Scanner sc = new Scanner(System.in);
		 * 
		 * System.out.println("Digite uma palavra: "); String a; a = sc.next();
		 * System.out.println("A palavra digitada é: " + a);
		 * 
		 * System.out.println("Digite um número:"); int b; b = sc.nextInt();
		 * System.out.println("O valor digitado é: " + b);
		 * 
		 * 
		 * System.out.println("Digite um número quebrado:"); double c; c =
		 * sc.nextDouble(); System.out.printf("O valor digitado é:" + " %.2f%n", c);
		 * 
		 * System.out.println("Digite uma palavra:"); char d; d = sc.next().charAt(0);
		 * sc.close(); System.out.println("A primeira letra é: " + d);
		 */

		// ENTRADA DE DADOS - 2
		/*
		 * Scanner sc = new Scanner(System.in); int i1; String s1, s2, s3;
		 * 
		 * i1 = sc.nextInt(); sc.nextLine(); // <- Para não perder a próxima quebra de
		 * linha s1 = sc.nextLine(); s2 = sc.nextLine(); s3 = sc.nextLine();
		 * 
		 * System.out.println("DIGITADOS: "); System.out.println(i1);
		 * System.out.println(s1); System.out.println(s2); System.out.println(s3);
		 */

		// FUNÇÕE MATEMÁTICAS
		/*
		 * double a, b, c;
		 * 
		 * a = Math.sqrt(9); b = Math.pow(9, 2); c = Math.abs(-9);
		 * 
		 * System.out.println(a); System.out.println(b); System.out.println(c);
		 */
		sc.close();
	}
}

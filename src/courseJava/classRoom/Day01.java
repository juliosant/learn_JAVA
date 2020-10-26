package courseJava.classRoom;

import java.util.Scanner;
import java.util.Locale;

public class Day01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		/*
		 *
		 * 
		 * int hora; System.out.println("Escreva um número"); hora = sc.nextInt();
		 * 
		 * if (hora>=6 && hora<=11) { System.out.println("Bom dia"); }
		 * 
		 * else if(hora>=12 && hora <=18) { System.out.println("Boa tarde"); }
		 * 
		 * else if((hora>=18 && hora<=24) || (hora>=0 && hora<=5)) {
		 * System.out.println("Boa noite"); }
		 * 
		 * else { System.out.println("hora inválida"); }
		 * 
		 * sc.close();
		 */
		
		//EXERCÍCIO
		/*
		Scanner sc = new Scanner(System.in);
		double x, y;

		System.out.println("digite outra abscissa");
		x = sc.nextDouble();

		System.out.println("Digite uma ordenada");
		y = sc.nextDouble();

		if (x == 0.0) {
			if(y == 0.0) {
				System.out.println("ORIGEM");
			}
			if (y > 0.0) {
				System.out.println("Q1-Q2");
			}
			if (y < 0.0) {
				System.out.println("Q3-Q4");
			}
		}

		if (x > 0.0) {
			if(y == 0.0) {
				System.out.println("Q1-Q4");
			}
			if (y > 0.0) {
				System.out.println("Q1");
			}
			if (y < 0.0) {
				System.out.println("Q4");
			}
		}
		if (x < 0.0) {
			if(y == 0.0) {
				System.out.println("Q2-Q3");
			}
			if (y > 0.0) {
				System.out.println("Q2");
			}
			if (y < 0.0) {
				System.out.println("Q3");
			}
		}
		*/
		//VARIAVEIS ACUMULATIVAS
		/*
		System.out.println("digite um número");
		double a = sc.nextDouble();
		
		System.out.println("Escolha uma das opções:\n"
				+ "[1] ADICIONAR  MAIS 1\n"
				+ "[2] SUBTRAIR MENOS 1\n"
				+ "[3] MULTIPLICAR POR 2\n"
				+ "[4] DIVIDIR POR 2");
		int op = sc.nextInt();
		
		/*
		if(op == 1) {
			a += 1; //a = a+1
		}
		if(op == 2) {
			a -= 1; //a = a-1
		}
		if(op == 3) {
			a *= 2; //a = a*2
		}
		if(op == 4) {
			a /= 2; //a = a/2
		}
		System.out.println(a);
		
		
		*/
		
		//SWITCH - CASE
		/*
		switch(op) {
		
		case 1:
			a += 1; //a = a+1
			break;
		case 2:
			a -= 1; //a = a-1
			break;
		case 3:
			a *= 2; //a = a*2
			break;
		case 4:
			a /= 2; //a = a/2
			break;
		default:
			System.out.println("Opção inválida!");
			
		}
			
		System.out.println(a);
		sc.close();
		*/
		
		//CONDICIONAL TERNÁRIA
		/*
		String result = (2>5) ? "sim": "não";
		System.out.println(result);
		
		result = (result == "não")? "sim":"não";
		System.out.println(result);
		
		result = (result != "sim")? "sim":"não";
		System.out.println(result);
		*/
		sc.close();
	}

}

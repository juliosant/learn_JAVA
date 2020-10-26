//CONSTANTES

package courseJava.classRoom;

import java.util.Locale;
import java.util.Scanner;

import courseJava.classRoom.utilitaries.Calculator;

public class Day04 {

	
			
	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = Calculator.circumference(radius);
		
		double v = Calculator.volume(radius);
		
		System.out.printf("CIRCUMFERENCE: %.2f\n", c);
		System.out.printf("VOLUME: %.2f\n", v);
		System.out.printf("PI: %.2f", Calculator.PI);
		
		sc.close();
	}
	
	
}

//OBS.0: Em uma mesma classe, métodos estáticos não podem chamar métodos não estáticos
		/*
		 * o metodo main, por exempl, não poderia chamar circumference/volume se não
		 * estáticos.
		*/
//OBS.1: Métodos/Atributos estáticos podem ser chamados sem necessidade instância. 
		 /*
		  * Basta apenas informar o nome da classe seguido do método/atributo.
		  */
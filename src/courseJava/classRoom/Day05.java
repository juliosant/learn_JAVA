package courseJava.classRoom;

import java.util.Locale;
import java.util.Scanner;

import courseJava.classRoom.entities.ProductPrivate;
import courseJava.classRoom.entities.Retangle;

public class Day05 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		/*01
		// Passagem referência -> Classes
		Retangle retangle0 = new Retangle();
		retangle0.height = 5.0;
		retangle0.width = 10.0;

		Retangle retangle1 = retangle0;

		System.out.println(retangle0);
		System.out.println(retangle1);

		retangle0.width = 12;

		System.out.println(retangle0);
		System.out.println(retangle1); // Largura alterada para 12 também

		// Passagem valor -> Tipos primitivos

		String a = "Maria";
		String b = a;

		System.out.println(a + " : " + b);

		a = "Jose";

		System.out.println(a + " : " + b);
		*/
		
		//02
		/*
		System.out.println("quantas pessoas serão cadastradas?");
		int pessoas = sc.nextInt();
		
		double[] alturas = new double[pessoas];
		
		for (int i = 0; i<alturas.length;i++) {
			System.out.println("digite a "+ (i+1) + "ª altura: ");
			alturas[i] = sc.nextDouble();
			System.out.println(i);
			
		}
		
		for (int i = 0; i<alturas.length;i++) {
			System.out.println("Altura "+ (i+1) + ": " + alturas[i]);
		}
		*/
		
		//03
		/*
		System.out.println("Quantos produtos você deseja cadastrar?");
		int qtde = sc.nextInt();
		ProductPrivate[] product = new ProductPrivate[qtde];
		
		for (int i = 0; i<product.length; i++) {
			System.out.println("Produto " + (i+1));
			product[i] = new ProductPrivate();
			System.out.println("Nome:\n");
			product[i].setName(sc.next());
			System.out.println("Preço:");
			product[i].setPrice(sc.nextDouble());
		}
		
		for (int i = 0; i<product.length; i++) {
			System.out.println("Produto :)" + (i+1) + ":" + product[i]);
		}
		
		double sum = 0;
		for (int i = 0; i < product.length; i++) {
			sum += product[i].getPrice();
		}
		
		System.out.println("Media de preços: " + String.format("%.2f", sum/product.length));
		*/
		
		//04
		/*
		//Boxing
		System.out.println("--------------------Boxing");
		int x = 20;
		Object obj = x;
		
		System.out.println(x);
		System.out.println(obj);
		
		x = 40;
		System.out.println(x);
		System.out.println(obj);
		System.out.println("--------------------");
		
		//Umboxing
		System.out.println("--------------------Umboxing");
		
		int y = (int) obj;
		System.out.println(y);
		System.out.println(obj);
		System.out.println("--------------------");
		
		obj = 45;
		System.out.println(y);
		System.out.println(obj);
		*/
		
		String[] words = new String[] {"Maria", "João", "Rita"};
		
		for (String word : words) {
			System.out.println(word);
		}
		sc.close();
	}
}

/*
 * OBS: Heap memória de execução Stack memoria fixa; alocação Garbage collector
 * desaloca objetos de instâncias sem referência afim de liberar memória
 * 
 * boxing converter objeto tipo valor para referência equivalente
 * wrapper classes trata os tipos primitivos como classes
 */

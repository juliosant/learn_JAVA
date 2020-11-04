package courseJava.classRoom;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Day09a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//EXCEÇÕES
		
		//TRY-CATCH
		
		method1();
	}
	public static void method1() {
		System.out.println("***METHOD 1 START***");
		method2();
		System.out.println("***METHOD 1 END***");
	}
	
	public static void method2() {
		System.out.println("***METHOD 2 START***");
		Scanner sc = new Scanner(System.in);
		
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		}
		catch(InputMismatchException e){
			System.out.println("Input error!");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position");
			//STACKTRACE
			//e.printStackTrace();
			//sc.next();
		}
		//FINALLY
		finally {
			System.out.println("Finally was executed");
		}
		sc.close();
		System.out.println("End of program!");
		System.out.println("***METHOD 2 END***");
	}
}
//Stacktrace: identificar raiz da chamada de um trecho do código que gerou uma exceção.

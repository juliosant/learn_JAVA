package courseJava.classRoom;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Day06 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// LISTAS
		/*
		 * List<String> nameList = new ArrayList<String>(); nameList.add("Maria");
		 * nameList.add("José"); nameList.add("André");
		 * 
		 * showNameList(nameList);
		 * 
		 * if(nameList.contains("Maria")) { nameList.remove("Maria");
		 * System.out.println("\nRemoving Maria from Lista...\n"); }
		 * 
		 * showNameList(nameList);
		 * 
		 * System.out.println("\nAdd Pamela to the list in front of André...\n");
		 * nameList.add(1, "Pamela"); //(posição, conteúdo) showNameList(nameList);
		 * 
		 * System.out.println("\nAdd Fabiola to the top of the list...\n");
		 * nameList.add(0, "Fabíola"); //(posição, conteúdo) showNameList(nameList);
		 * 
		 * System.out.println("\nRemoving the first member from the list...\n");
		 * nameList.remove(0); //(posição, conteúdo) showNameList(nameList);
		 * 
		 * System.out.println("\nRemove member with initial letter P" );
		 * nameList.removeIf(x -> x.charAt(0) == 'P');
		 * 
		 * System.out.println("\nUpdated list:"); showNameList(nameList);
		 * 
		 * System.out.println("\nList size: "+ nameList.size());
		 * 
		 * System.out.println("Index of André in list: " +
		 * (nameList.indexOf("André")+1));
		 * 
		 * 
		 * System.out.println("\n---------------------------------------------\n");
		 * 
		 * System.out.println("Add new membrer from the list...\n");
		 * 
		 * String[] newNames = new String[]{"Antonia", "Raimundo", "Elmadan", "Helena",
		 * "Isadora", "Severino"};
		 * 
		 * for(String name : newNames) { nameList.add(name); }
		 * 
		 * System.out.println("\nCompleted List\n");
		 * 
		 * showNameList(nameList);
		 * 
		 * List<String> nameLetterA = nameList.stream().filter(x -> x.charAt(0) ==
		 * 'A').collect(Collectors.toList());
		 * 
		 * System.out.println("\nShow names with the initial letter A:");
		 * showNameList(nameLetterA);
		 * 
		 * System.out.println("\nShow first name with initial letter A:"); String name =
		 * nameList.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		 * System.out.println(name);
		 */

		// MATRIZ
		System.out.println("How many cells do you want add in a row and column?");
		int n = sc.nextInt();
		int[][] mat = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.println("Row: " + i + "\nColumn: " + j);
				mat[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("["+mat[i][j]+"] ");
			}
			System.out.print("\n");
		}
		System.out.println("Main Diagonal: ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j) {
					System.out.println(mat[i][j]);
				}
			}
		}
		
		
		System.out.println("Negative numbers: ");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] < 0) {
					System.out.println(mat[i][j]);
				}
			}
		}
		System.out.println("Tamanho da matriz: " + mat.length);


		sc.close();

	}
	/*
	 * public static void showNameList( List<String> nameList) { for(String name :
	 * nameList) { System.out.println(name); }
	 * 
	 * }
	 */
}

package courseJava.basic;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Class06 {
	public static void main(String[] args) {
		List<String> nameList = new ArrayList<String>();
		nameList.add("Maria");
		nameList.add("José");
		nameList.add("André");
		
		showNameList(nameList);
		
		if(nameList.contains("Maria")) {
			nameList.remove("Maria");
			System.out.println("\nRemoving Maria from Lista...\n");
		}
		
		showNameList(nameList);
		
		System.out.println("\nAdd Pamela to the list in front of André...\n");
		nameList.add(1, "Pamela"); //(posição, conteúdo)
		showNameList(nameList);
		
		System.out.println("\nAdd Fabiola to the top of the list...\n");
		nameList.add(0, "Fabíola"); //(posição, conteúdo)
		showNameList(nameList);
		
		System.out.println("\nRemoving the first member from the list...\n");
		nameList.remove(0); //(posição, conteúdo)
		showNameList(nameList);
		
		System.out.println("\nRemove member with initial letter P" );
		nameList.removeIf(x -> x.charAt(0) == 'P');
		
		System.out.println("\nUpdated list:");
		showNameList(nameList);
		
		System.out.println("\nList size: "+ nameList.size());
		
		System.out.println("Index of André in list: " + (nameList.indexOf("André")+1));
		
		
		System.out.println("\n---------------------------------------------\n");
		
		System.out.println("Add new membrer from the list...\n");
		
		String[] newNames = new String[]{"Antonia", "Raimundo", "Elmadan", "Helena", "Isadora", "Severino"};
		
		for(String name : newNames) {
			nameList.add(name);
		}
		
		System.out.println("\nCompleted List\n");
		
		showNameList(nameList);
		
		List<String> nameLetterA = nameList.stream().filter(x -> x.charAt(0) ==	 'A').collect(Collectors.toList());
		
		System.out.println("\nShow names with the initial letter A:");
		showNameList(nameLetterA);
		
		System.out.println("\nShow first name with initial letter A:");
		String name = nameList.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
	}
	public static void showNameList( List<String> nameList) {
		for(String name : nameList) {
			System.out.println(name);
		}
		
	}
}

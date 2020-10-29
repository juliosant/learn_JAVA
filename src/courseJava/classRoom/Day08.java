package courseJava.classRoom;

import java.util.Locale;
import java.util.Scanner;

import courseJava.classRoom.entities.Account;
import courseJava.classRoom.entities.BusinessAccount;
import courseJava.classRoom.entities.SavingsAccount;

public class Day08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		//HERANÇA
		/*
		BusinessAccount account = new BusinessAccount(); //variable type Account, instance type bussinesAccount
		System.out.println("Enter with account data:");
		System.out.print("Number Account: ");
		account.setNumber(sc.nextInt());
		sc.nextLine();
		System.out.print("Holder name: ");
		account.setHolder(sc.nextLine());
		
		System.out.println("How many do you want to deposit?");
		Double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Your balance in account is: " + String.format("%.2f", account.getBalance()));
		
		
		System.out.println("How many do you want to withdraw?");
		Double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("Your balance in account is: " + String.format("%.2f", account.getBalance()));
		
		System.out.println("How many do you want to loan?");
		Double loanValue = sc.nextDouble();
		account.loan(loanValue);
		System.out.println("Your balance in account is: " + String.format("%.2f", account.getBalance()));
		
		System.out.println("Sign out...");
		*/
		/*
		Account acc = new Account(3052, "Julio Santiago", 0.00);
		BusinessAccount bcc = new BusinessAccount(0005, "Vanessa Ângelina", 0.00, 350.00);
		
		//UPCASTING: Class = new Subclass;
		
		Account acc1 = bcc; //You can to assign for a variable of type Account, a variable of type BussinessAcount.
		Account acc2 = new BusinessAccount(1003, "Natália", 0.00, 400.00);
		Account acc3 = new SavingsAccount(2008, "José", 0.00, 800.0);
		
		//DOWNCASTING
		BusinessAccount bcc1 = (BusinessAccount)acc2; //You can to assign for a variable of type Account, a variable of type BussinessAcount, if you to force convention.
		bcc.loan(250.00);
		
		
		//INSTANCEOF
		if(acc3 instanceof BusinessAccount) {
			BusinessAccount bcc2 = (BusinessAccount)acc3;
			bcc2.loan(300.00);
			System.out.println("Loan");
		}
		else if(acc3 instanceof SavingsAccount) {
			SavingsAccount scc1 = (SavingsAccount)acc3;
			scc1.updateBalace();
			System.out.println("Update! scc1");
		}
		
		if (acc2 instanceof BusinessAccount) {
			BusinessAccount bcc2 = (BusinessAccount)acc2;
			bcc2.loan(300.00);
			System.out.println("Loan bcc2!");
		}
		*/
		
		//POLIMORFISMO
		Account acc = new Account(0005, "João", 800.0);
		
		BusinessAccount bcc = new BusinessAccount(1007, "Antônio", 800.00, 500.00);
		
		SavingsAccount scc = new SavingsAccount(2003, "Maria", 800.0, 500.00);
				
		acc.withdraw(300.00); //normal
		bcc.withdraw(300.00); //with override (super)
		scc.withdraw(300.00); //with override
		
		System.out.println(
				String.format("%.2f", acc.getBalance()) // -> 495
				+ " : "
				+ String.format("%.2f", bcc.getBalance()) // -> 498
				+ " : "
				+ String.format("%.2f", scc.getBalance())); // -> 500
		sc.close();
	}

}


// Protected: accessed by same package subclasses or different package subclasses 

//final: method: prevent the method from being overridden
//		 class: prevent the class from being inherited

//Polimorfismo: variáveis do mesmo tipo que podem ter comportamentos diferentes.
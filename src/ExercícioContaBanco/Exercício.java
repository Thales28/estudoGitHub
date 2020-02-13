package ExercícioContaBanco;

import java.util.Locale;
import java.util.Scanner;
import entities.Account;

public class Exercício {

	public static void main(String[] args) throws Exception {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String userName = sc.nextLine();
		
		System.out.print("Is there an inicial deposit (y/n)? ");
		char answer =  sc.next().charAt(0);
		
		Account account;
		
		if(answer == 'y' || answer == 'Y') {
			System.out.print("Enter the initial deposit value: ");
			double value = sc.nextDouble();
			account = new Account(accountNumber, userName, value);
		}
		else {
			account = new Account(accountNumber, userName);
		}
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		
		double value = sc.nextDouble();
		
		account.deposit(value);
		
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		
		value = sc.nextDouble();
		
		account.withdraw(value);
		
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		sc.close();
	}

}

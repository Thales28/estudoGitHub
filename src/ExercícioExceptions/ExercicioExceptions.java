package ExercícioExceptions;

import java.util.InputMismatchException;
// import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class ExercicioExceptions {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	//	Locale.setDefault(Locale.US);
		
		System.out.println("Enter account data");
		try {
			System.out.print("Number: ");
			int number = sc.nextInt();
			sc.nextLine();
			
			System.out.print("Holder: ");
			String holder = sc.nextLine();
			
			System.out.print("Initial balance: ");
			double balance = sc.nextDouble();
			sc.nextLine();
			
			System.out.print("Withdraw limit: ");
			double withdrawLimit = sc.nextDouble();
			sc.nextLine();
			
			Account account = new Account(number, holder, balance, withdrawLimit);
			
			System.out.println();
			System.out.print("Enter amount for withdraw: ");
			double amount = sc.nextDouble();
			sc.nextLine();
			
			account.withdraw(amount);
			
			System.out.printf("New balance: %.2f%n",account.getBalance());
		}
		
		catch (InputMismatchException exception) {
			System.out.println("Invalid input");
		} 
		
		catch (Exception exception) {
			System.out.println(exception.getMessage());
			//e.printStackTrace();
		}		
		
		finally {
			if(sc != null) {
				sc.close();
			}
		}
	}
}

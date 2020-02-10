package ExercícioFixação;

import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		
		double dollarPrice = sc.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		
		double dollars = sc.nextDouble();
		
		System.out.printf("Amount to be paid in reais = %.2f%n", CurrencyConverter.amountInReais(dollarPrice, dollars, 6));
		
		sc.close();
	}

}

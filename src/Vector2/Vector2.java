package Vector2;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Vector2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int productsNumber = sc.nextInt();
		sc.nextLine();
		
		Product[] productVector= new Product[productsNumber];
		
		for (int i = 0; i < productVector.length; i++) {
			productVector[i] = new Product(sc.nextLine(), sc.nextDouble());
			sc.nextLine();
		}
		
		double sum = 0.0;
		
		for (int i = 0; i < productVector.length; i++) {
			sum += productVector[i].getPrice();
		}
		
		double avgPrice = sum/productVector.length;
		
		System.out.printf("AVERAGE PRICE = %.2f%n", avgPrice);
		
		sc.close();
	}

}
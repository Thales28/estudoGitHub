package ExercícioHerançaProduto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class ExercicioHerancaProduct {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of products: ");
		int numberProducts = sc.nextInt();
		sc.nextLine();
		
		List<Product> productList = new ArrayList<>();
		
		for (int i = 1; i <= numberProducts; i++) {
			System.out.println("Product #"+i+ " data: ");
			System.out.print("Commom, used or imported (c/u/i)? ");
			char cui = sc.next().charAt(0);
			sc.nextLine();
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Price: ");
			double price = sc.nextDouble();
			sc.nextLine();
			
			if (cui == 'i') {
				System.out.print("Customs Fee: ");
				double customsFee = sc.nextDouble();
				sc.nextLine();
				ImportedProduct importedProduct = new ImportedProduct(name, price, customsFee);
				productList.add(importedProduct);
			}
			
			else if (cui == 'c') {
				Product product = new Product(name, price);
				productList.add(product);
			}
			
			else if (cui == 'u') {
				SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy");
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date date = sdf.parse(sc.nextLine());
				
				UsedProduct usedProduct = new UsedProduct(name, price, date);
				productList.add(usedProduct);
			}
		}
		System.out.println();
		System.out.println("PRICE TAGS: ");
		for (Product product : productList) {
			System.out.println(product.priceTag());
		}
	}
}
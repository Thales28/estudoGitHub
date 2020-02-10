package RegisterProducts;
import entities.Product;
import java.util.Scanner;

public class RegisterProducts {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter product data: ");
		System.out.print("Name: ");

		String name = sc.nextLine();

		System.out.print("Price: ");

		double price = sc.nextDouble();

		Product product = new Product(name, price);

		System.out.print("Product data: ");
		productData(product);
		System.out.print("Enter the number of products to be added in stock: ");

		product.addProducts(sc.nextInt());

		System.out.print("Updated data: ");
		productData(product);
		System.out.print("Enter the number of products to be removed from stock: ");

		product.removeProducts(sc.nextInt());

		System.out.print("Updated data: ");
		productData(product);

		sc.close();
	}

	public static void productData(Product item) {

		System.out.println(item);
		System.out.println(" ");
	}
}

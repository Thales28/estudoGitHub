package composicaoEntidades;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entitiesEnum.OrderStatus;

public class ComposicaoEntidades {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Enter client data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		System.out.print("Email: ");
		String email = sc.nextLine();
		
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf1.parse(sc.nextLine());
		
		Client client = new Client(name, email, birthDate);
		
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		String status = sc.nextLine().toUpperCase();
		
		System.out.print("How many items to this order? ");
		int itemsNumber = sc.nextInt();
		sc.nextLine();
		LocalDateTime systemDate = LocalDateTime.now();
		Order order = new Order(systemDate, OrderStatus.valueOf(status), client);
		
		Product product = new Product();
		
		OrderItem orderItem = new OrderItem();
		
		for (int i = 1; i <= itemsNumber; i++) {
			System.out.println("Enter #"+i+ " item data: ");
			System.out.print("Product name: ");
			String productName = sc.nextLine();
			
			System.out.print("Product price: ");
			double productPrice = sc.nextDouble();
			sc.nextLine();
			
			product = new Product(productName, productPrice);
			
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			sc.nextLine();
			
			orderItem = new OrderItem(quantity, product);
			order.addItem(orderItem);
		}
		
		System.out.println("ORDER SUMMARY: ");
		System.out.println(order);
		System.out.println(client);
		List<OrderItem> itemList = order.getItems();
		for (OrderItem x : itemList) {
			System.out.println(x);
		}
		System.out.println("Total price: $" + String.format("%.2f", order.total()));
		
		sc.close();
	}
}
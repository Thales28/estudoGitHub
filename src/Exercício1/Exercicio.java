package Exercício1;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;
import entities.Rectangle;

public class Exercicio {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter rectangle width and height:");
		
		Rectangle rectangle = new Rectangle();
		rectangle.width = sc.nextDouble();	
		rectangle.height = sc.nextDouble();
		
		NumberFormat formatter = new DecimalFormat("#0.00");
		
		System.out.println("AREA = " + formatter.format(rectangle.area()));
		System.out.println("PERIMETER = " + formatter.format(rectangle.perimeter()));
		System.out.println("DIAGONAL = " + formatter.format(rectangle.diagonal()));
		
		sc.close();
	}

}

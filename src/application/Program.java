package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Triangle;


public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Enter the measures of triangle X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Enter the measures of triangle Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		System.out.printf("Triangle X area: %.4f%n",x.area());
		System.out.printf("Triangle Y area: %.4f%n",y.area());
		
		int higherTri = higherTriangle(x.area(), y.area());
		
		if (higherTri >= 0) {
			System.out.println("Triangle X has a larger area");
		}
		else {
			System.out.println("Triangle Y has a larger area");
		}
		
		sc.close();
	}
	
	public static int higherTriangle(double a, double b) {
		if(a > b) {
			return 1;
		}
		else if (b > a) {
			return -1;
		}
		else {
			return 0;
		}
	}
}

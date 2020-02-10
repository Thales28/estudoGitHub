package Vector;

import java.util.Scanner;
import java.util.Locale;

public class Vector {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double[] vector = new double[n];
		
		for (int i = 0 ; i < n ; i++) {
			vector[i] = sc.nextDouble();
		}
		
		double sum = 0.0;
		for (int i = 0; i < n; i++) {
			sum += vector[i];
		}
		
		double avg = sum/n;
		
		System.out.println("AVEGARE HEIGHT= " + String.format("%.2f", avg));
		
		sc.close();
	}

}

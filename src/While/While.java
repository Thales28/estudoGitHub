package While;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int integer = sc.nextInt();
	int sum = 0;
	
	while (integer != 0) {
		sum += integer;
		integer = sc.nextInt();
	}
	
	System.out.println(sum);
	
	sc.close();
	}

}

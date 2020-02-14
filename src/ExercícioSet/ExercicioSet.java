package ExercícioSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class ExercicioSet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Integer> set = new HashSet<>();
		
		List<String> courses = new ArrayList<>();
		
		courses.add("A");
		courses.add("B");
		courses.add("C");
		
		for (String x : courses) {
			System.out.print("How many students for course " + x + "? ");
			int a = sc.nextInt();
			sc.nextLine();
			
			for (int i = 0; i < a; i++) {
				int student = sc.nextInt();
				sc.nextLine();
				set.add(student);
			}
		}
		
		System.out.println("Total students: "+ set.size());	
		sc.close();
	}
}
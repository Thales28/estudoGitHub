package ExercícioStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee2;

public class ExercicioStream {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(new Locale("en", "US"));
		
		System.out.print("Enter full file path: ");
		String path = sc.nextLine();
		
		System.out.print("Enter salary: ");
		Double salary = (Double) Double.parseDouble(sc.nextLine());
		
		try (BufferedReader br = new BufferedReader ( new FileReader(path))){
			List<Employee2> employeeList = new ArrayList<>();
			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				Double employeeSalary = Double.parseDouble(fields[2]);
				employeeList.add(new Employee2(fields[0], fields[1], employeeSalary));	
				line = br.readLine();
			}
			
			// salary > than x (sorted ascending)
			//Sum of salary of people that name starts with 'M'
			
			Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
			
			List<String> emailsList = employeeList.stream().filter(p -> p.getSalary() > salary)
					.map(p -> p.getEmail()).sorted(comp).collect(Collectors.toList());
			
			System.out.println("Email of people whose salary is more than "+ String.format("%.2f", salary) + ":");
			
			emailsList.forEach(System.out::println);
			
			Double sum = employeeList.stream().filter(p -> p.getName().charAt(0) == 'M').map( p -> p.getSalary())
					.reduce(0.0, (x, y) -> x + y);
			
			System.out.println("Sum of salary of people whose name starts with 'M': " + String.format("%.2f", sum));
		}

		catch (IOException exception) {
			System.out.println("Error: " + exception.getMessage());
		}	
		sc.close();
	}
}

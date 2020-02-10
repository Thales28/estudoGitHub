package ExercicioEmployees;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;

public class ExercicioEmployees {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many employees will be registered? ");
		int employees = sc.nextInt();
		sc.nextLine();
		
		List<Employee> employeeList = new ArrayList<>();

		for (int i = 1; i <= employees; i++) {
			System.out.println("Employee #"+i+": ");
			
			System.out.print("Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			sc.nextLine();
			
			System.out.println();
			employeeList.add(new Employee(id, name, salary));
		}
		
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter the percentage: ");
		double percentage = sc.nextDouble();
		sc.nextLine();
		
		boolean found = false;
		for (Employee x : employeeList) {
			if (x.getId() == id) {
				x.increaseSalary(percentage);
				found = true;
			}
		}
		System.out.println();
		if (found) {
			System.out.println("Success!");
		}
		else {
			System.out.println("Employee not found!");
		}
		System.out.println();
		System.out.println("List of employees: ");
		
		for (Employee x : employeeList) {
			System.out.println(x);
		}
		
		sc.close();
	}

}

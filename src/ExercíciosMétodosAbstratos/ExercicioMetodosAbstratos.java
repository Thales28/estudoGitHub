package ExercíciosMétodosAbstratos;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.LegalPerson;
import entities.Person;
import entities.PhysicalPerson;

public class ExercicioMetodosAbstratos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Enter the number of tax payers: ");
		int taxPayersNumber = sc.nextInt();
		sc.nextLine();
		
		List<Person> personList = new ArrayList<>();
		
		for (int i = 1; i <= taxPayersNumber; i++) {
			Locale.setDefault(Locale.US);
			System.out.println("Tax payer #"+i+" data: ");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Annual income: ");
			double annualIncome = sc.nextDouble();
			sc.nextLine();
			
			if(ch == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				sc.nextLine();
				PhysicalPerson physicalPerson = new PhysicalPerson(name, annualIncome, healthExpenditures);
				personList.add(physicalPerson);
			}
			else if (ch == 'c') {
				System.out.print("Number of employees: ");
				int employeesNumber = sc.nextInt();
				sc.nextLine();
				LegalPerson legalPerson = new LegalPerson(name, annualIncome, employeesNumber);
				personList.add(legalPerson);
			}
		}
		System.out.println();
		System.out.println("TAXES PAID: ");
		double sum = 0.0;
		for (Person x : personList) {
			System.out.printf(x.getName()+ ": $%.2f%n", x.taxValue());
			sum += x.taxValue();
		}
		System.out.println();
		System.out.printf("TOTAL TAXES: $%.2f%n", sum);
		
		sc.close();
	}
}

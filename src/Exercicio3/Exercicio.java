package Exercicio3;

import java.util.Scanner;
import entities.Student;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Exercicio {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		NumberFormat formatter = new DecimalFormat("#0.00");
		Student student = new Student();
		
		System.out.print("Name: ");
		
		student.name = sc.nextLine();
		
		System.out.print("Nota 1: ");
		
		student.nota1 = sc.nextDouble();
		
		System.out.print("Nota 2: ");
		
		student.nota2 = sc.nextDouble();
		
		System.out.print("Nota 3: ");
		
		student.nota3 = sc.nextDouble();
		
		System.out.println("FINAL GRADE = "+ formatter.format(student.notaTotal()));
		System.out.println(student.passed());
		
		if(student.notaTotal() < 60) {
			System.out.println("MISSING " + formatter.format(student.missing()) + " POINTS");
		}
		
		sc.close();
	}

}

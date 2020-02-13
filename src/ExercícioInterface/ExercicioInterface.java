package ExercícioInterface;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Contract;
import entities.Installment;
import services.ContractService;
import services.PaymentService;

public class ExercicioInterface {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter contract data");
		System.out.print("Number: ");
		int number = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Date (DD/MM/YYYY): ");
		Date date = sdf.parse(sc.nextLine());

		System.out.print("Contract value: ");
		double value = sc.nextDouble();
		sc.nextLine();
		
		System.out.print("Enter number of installments: ");
		int installments = sc.nextInt();
		sc.nextLine();
		
		List<Installment> installmentList;
		installmentList = new ArrayList<>();
		Contract contract = new Contract(number, date, value, installmentList);
		
		ContractService contractService = new ContractService(new PaymentService());
		
		contractService.processContract(contract, installments);
		
		System.out.println("Installments: ");
		for (Installment installment : contract.getInstallments()) {
			System.out.println(sdf.format(installment.getDueDate()) + " - " + String.format("%.2f", installment.getAmount()));
		}
		sc.close();
	}
}
package services;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import entities.Contract;
import entities.Installment;

public class ContractService {
	private OnlinePaymentService onlinePaymentService;
	
	public ContractService (OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}
	
	public void processContract (Contract contract, int months) throws Exception {

		List<Installment> installments = new ArrayList<>();
		Calendar cal = Calendar.getInstance();
		cal.setTime(contract.getDate());
		
		double amount = contract.getTotalValue() / months;
		
		for (int i = 1; i <= months; i++) {
			cal.add(Calendar.MONTH, 1);
			Date d = cal.getTime();
			
			double adjustedAmount = onlinePaymentService.paymentFee(onlinePaymentService.interest(amount, i));
			Installment installment = new Installment(d, adjustedAmount);
			
			installments.add(installment);
		}
		
		contract.setInstallments(installments);
	}
}

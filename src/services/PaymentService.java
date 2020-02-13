package services;

public class PaymentService implements OnlinePaymentService {
	public double interest (double amount, int month) {
		return amount + (amount * 0.01 * month);
	}
	
	public double paymentFee (double amount) {
		return amount + (amount * 0.02);
	}
}

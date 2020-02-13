package services;

public interface OnlinePaymentService {
	public double interest (double amount, int month);
	public double paymentFee (double amount);
}
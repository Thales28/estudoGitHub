package Exerc�cioFixa��o;

public class CurrencyConverter {
	
	public static double amountInReais(double dollarPrice, double dollars, double iof) {
		
		return (dollars + dollars * iof / 100) * dollarPrice;
		
	}

}

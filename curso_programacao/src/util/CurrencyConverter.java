package util;

public class CurrencyConverter {
	
	public static double IOF = 0.06;
	
	public static double DolarConvert(double DollarPrice, double DollarBuy) {
		
		return DollarPrice * DollarBuy + (1.0 + IOF);
	}
}

package model.services;

public class TaxPaypal implements TaxServices
{
	private static final double FEE_PERCENTAGE = 0.02;
	private static final double MONTHLY_INTEREST =0.01;
	
	@Override
	public double tax(double amount) 
	{		
		return amount * FEE_PERCENTAGE;
	}
	@Override
	public double interest(double amount, int months) {
		
		return amount * MONTHLY_INTEREST * months;
	}

	
	
}

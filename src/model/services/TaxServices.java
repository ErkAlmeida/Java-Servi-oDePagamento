package model.services;

public interface TaxServices 
{
	double tax(double amount);
	
	double interest(double amount, int months);
}

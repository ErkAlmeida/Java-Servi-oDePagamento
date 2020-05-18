package model.services;

import java.util.Calendar;
import java.util.Date;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService 
{
	
	private TaxServices taxService;
	
	
	public ContractService(TaxServices taxService) {
		this.taxService = taxService;
	}
	
	private Date addMonths(Date date, int n) 
	{
		Calendar cal = Calendar.getInstance();
	
		cal.setTime(date);
		cal.add(Calendar.MONTH, n);
	
		return cal.getTime();
	}

	public void processContract(Contract contract, int months) 
	{
		double valueBasic = contract.getValorContract() /months;
		
		for(int i = 1 ; i<= months; i++)
		{
			Date date = addMonths(contract.getDateContract(), i);
			double updatedQuota = valueBasic + taxService.interest(valueBasic, i);
			double fullQuota = updatedQuota + taxService.tax(updatedQuota);
			contract.addListInstallment(new Installment(date, fullQuota));			
		}
	
	}

	
}

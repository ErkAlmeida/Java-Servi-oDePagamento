package model.entities;

import java.util.Date;

import model.services.TaxServices;


public class Contract {

	private Date dateContract;
	private Double valorContract;
	private Integer numberMonths;
	
	public TaxServices taxServices;
	
	public Contract(){}
	
	
	public Contract(Date dateContract, Double valorContract, Integer numberMonths, TaxServices taxServices) {

		this.dateContract = dateContract;
		this.valorContract = valorContract;
		this.numberMonths = numberMonths;
		this.taxServices = taxServices;
	}

	public Date getDateContract() {
		return dateContract;
	}


	public void setDateContract(Date dateContract) {
		this.dateContract = dateContract;
	}


	public Double getValorContract() {
		return valorContract;
	}


	public void setValorContract(Double valorContract) {
		this.valorContract = valorContract;
	}


	public Integer getNumberMonths() {
		return numberMonths;
	}


	public void setNumberMonths(Integer numberMonths) {
		this.numberMonths = numberMonths;
	}


	public TaxServices getTaxServices() {
		return taxServices;
	}


	public void setTaxServices(TaxServices taxServices) {
		this.taxServices = taxServices;
	}


	public Double processContract() {
		return 0.0;
		
	}
}

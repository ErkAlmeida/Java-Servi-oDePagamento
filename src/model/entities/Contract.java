package model.entities;

import java.util.Date;


public class Contract {

	private Date dateContract;
	private Double valorContract;
	
	public Contract(){}
	
	public Contract(Date dateContract, Double valorContract) 
	{
		this.dateContract = dateContract;
		this.valorContract = valorContract;
	}
	
	public Date getDateContract () {
		
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
	
	
}

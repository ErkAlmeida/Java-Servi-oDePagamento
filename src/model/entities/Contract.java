package model.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Contract {

	private Date dateContract;
	private Double valorContract;
	private Integer number;
	
	List<Installment> listInstallment = new ArrayList<>();
	
	public Contract() {
		
	}

	public Contract(Date dateContract, Double valorContract, Integer number) {
	
		this.dateContract = dateContract;
		this.valorContract = valorContract;
		this.number = number;
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

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public List<Installment> getListInstallment() {
		return listInstallment;
	}
	
	public void addListInstallment(Installment installments) {
		
		listInstallment.add(installments);
	}
	
	public void removeInstallment(Installment installments) {
		listInstallment.remove(installments);
	}

}

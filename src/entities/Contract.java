package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {
	private Integer number;
	private Date date;
	private Double totalValue;
	private List<Installment> installments = new ArrayList<>();
	
	public Contract () {
		
	}
	
	public Contract (Integer number, Date date, Double totalValue, List<Installment> installments) throws Exception {
		if(number < 0) {
			throw new Exception ("Negative number");
		}
		if (totalValue < 0) {
			throw new Exception ("Negative total value");
		}
		this.number = number;
		this.date = date;
		this.totalValue = totalValue; 
		this.installments = installments;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) throws Exception {
		if(number < 0) {
			throw new Exception ("Negative number");
		}
		this.number = number;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(Double totalValue) throws Exception {
		if (totalValue < 0) {
			throw new Exception ("Negative total value");
		}
		this.totalValue = totalValue;
	}

	public List<Installment> getInstallments() {
		return installments;
	}

	public void setInstallments(List<Installment> installments) {
		this.installments = installments;
	}
}

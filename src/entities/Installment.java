package entities;

import java.util.Date;

public class Installment {
	private Date dueDate;
	private Double amount;
	
	public Installment () {
	}
	
	public Installment(Date dueDate, Double amount) throws Exception {
		if (amount < 0) {
			throw new Exception ("Negative amount");
		}
		
		this.dueDate = dueDate;
		this.amount = amount;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) throws Exception {
		if (amount < 0) {
			throw new Exception ("Negative amount");
		}
		this.amount = amount;
	}
}

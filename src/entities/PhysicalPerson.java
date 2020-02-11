package entities;

public class PhysicalPerson extends Person{
	private double healthSpending;
	
	public PhysicalPerson () {
		
	}
	
	public PhysicalPerson (String name, double annualIncome, double healthSpending) {
		super(name, annualIncome);
		this.healthSpending = healthSpending;
	}
	
	public double getHealthSpending() {
		return healthSpending;
	}

	public void setHealthSpending(double healthSpending) {
		this.healthSpending = healthSpending;
	}

	@Override
	public double taxValue() {
		double tax = 0.0;
		if(annualIncome < 20000.00) {
			tax = 0.15;
		}
		else {
			tax = 0.25;
		}
		return (annualIncome * tax) - (healthSpending * 0.5);
	}
}

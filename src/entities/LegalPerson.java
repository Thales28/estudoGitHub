package entities;

public class LegalPerson extends Person{
	private int employeesNumber; 
	
	public LegalPerson() {
		
	}
	
	public LegalPerson(String name, double annualIncome, int employeesNumber) {
		super(name, annualIncome);
		this.employeesNumber = employeesNumber;
	}
	
	public int getEmployeesNumber() {
		return employeesNumber;
	}

	public void setEmployeesNumber(int employeesNumber) {
		this.employeesNumber = employeesNumber;
	}
	
	@Override
	public double taxValue() {
		double tax = 0.16;
		if(employeesNumber > 10) {
			tax = 0.14;
		}
		return (annualIncome * tax);
	}
}

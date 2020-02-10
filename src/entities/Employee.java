package entities;

public class Employee {
	private int id;
	private String name;
	private double grossSalary;
	private double tax;
	
	public Employee() {
		
	}
	
	public Employee(int id, String name, double grossSalary) {
		this.id = id;
		this.name = name;
		this.grossSalary = grossSalary;
	}

	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public double netSalary() {
		
		return grossSalary - tax;
	}
	
	public void increaseSalary(double percentage) {
		
		grossSalary = grossSalary + grossSalary * percentage / 100;
	}

	@Override
	public String toString() {
		return id + ", " + name + ", " + String.format("%.2f", grossSalary);
	}
	
	
}
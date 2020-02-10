package entities;

public class Student {
	
	public String name;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double notaTotal() {
		return nota1 + nota2 + nota3;
	}
	
	public double missing() {
		return 60 - notaTotal();
	}
	
	public String passed() {
		if(notaTotal() >= 60) {
			return "PASS";
		}
		else {
			return "FAILED";
		}
	}
}

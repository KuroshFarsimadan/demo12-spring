package ir.kuroshfarsimadan;

public class Tire implements Leg {
	
	int numero;	
	
	public void setNumber(int numero) {
		this.numero = numero;
	}
	
	public String toString() {
		return "R"+numero;
	}
}

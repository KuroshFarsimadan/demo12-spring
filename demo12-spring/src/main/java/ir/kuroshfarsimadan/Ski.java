package ir.kuroshfarsimadan;

public class Ski implements Leg {

	int number;

	public void setNumber(int numero) {
		this.number = numero;
	}

	public String toString() {
		return "S" + number;
	}

}

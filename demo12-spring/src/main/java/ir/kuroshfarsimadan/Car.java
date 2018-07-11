package ir.kuroshfarsimadan;

public class Car {

	String name;
	Leg[] legs;

	public void setName(String nimi) {
		this.name = nimi;
	}

	public void setLegs(Leg[] jalat) {
		this.legs = jalat;
	}

	public String toString() {
		String out = this.name;
		for (Leg j : legs) {
			out += j;
		}
		out += " (" + super.toString() + ")";
		return out;
	}
}

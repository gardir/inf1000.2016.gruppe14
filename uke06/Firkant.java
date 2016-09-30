public class Firkant {

	private double lengde;
	private double bredde;

	public Firkant(double lengden, double bredden) {
		lengde = lengden;
		bredde = bredden;
	}

	public double returnAreal() {
		return lengde * bredde;
	}
	
}

package it.metodologie.lezionetre;

public class Quadrato {
	
	private double lato;

	public Quadrato(double lato) {
		this.lato = lato;
	}
	
	public double getLato() {
		return lato;
	}

	public void setLato(double lato) {
		this.lato = lato;
	}
	
	public double getPerimetro() {
		return lato*lato;
	}
	
	public static void main(String[] args) {
		var quadrato1 = new Quadrato(4.3);
		System.out.println(quadrato1.getPerimetro());
	}
}

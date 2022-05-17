package it.metodologie.lezionetre.puntisegmento;

public class Segmento {
	
	private Punto a, b;
	
	public Segmento(Punto a, Punto b) {
		this.a = a;
		this.b = b;
	}

	public Punto getA() {
		return a;
	}

	public void setA(Punto a) {
		this.a = a;
	}

	public Punto getB() {
		return b;
	}

	public void setB(Punto b) {
		this.b = b;
	}
	
	

}

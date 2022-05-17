package it.metodologie.lezionetre;

public class Cerchio {

	private double raggio;
	
	public Cerchio(double raggio) {
		this.raggio = raggio;
	}
	
	public double getRaggio() {
		return raggio;
	}

	public void setRaggio(double raggio) {
		this.raggio = raggio;
	}

	public double getCircongerenza() {
		return 2 * Math.PI * raggio;
	}
	
	public double getArea() {
		return Math.PI * Math.pow(raggio, 2);
	}
	
	public static void main(String[] args) {
		var cerchio1 = new Cerchio(1.2);
		var cerchio2 = new Cerchio(2);
		System.out.println(cerchio1.getCircongerenza());
		System.out.println(cerchio2.getArea());
		
	}
}

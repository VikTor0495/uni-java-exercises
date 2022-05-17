package it.metodologie.lezionetre;

public class Stringa42 {

	private String s;
	
	public Stringa42(String s1, String s2, String s3) {
		this.s = s1 + " " + s2 + " " + s3;
		if (s.length() > 42) this.s = s.substring(0, 42);
	}
	
	public String getS() {
		return this.s;
	}
	
	public String getIniziale() {
		return this.s.substring(0,1);
	}
	
	public boolean isStringaMagica() {
		return "42 42 42".equals(this.s);
	}
	
	public boolean contains42() {
		return this.s.indexOf("42") > -1;
	}
	
	public static void main(String[] args) {
		var s1 = new Stringa42("ciao", "heii", "bellaaa");
		System.out.println(s1.getS());
	}
}

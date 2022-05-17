package it.metodologie.lezionetre;

public class Programmatore {
	
	private String nome, cognome, azienda, linguaggi;
	
	public Programmatore(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
		this.linguaggi = "";
	}

	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	public String getAzienda() {
		return azienda;
	}

	public void setAzienda(String azienda) {
		this.azienda = azienda;
	}

	public String getLinguaggi() {
		return linguaggi;
	}

	public void addLinguaggio(String linguaggio) {
		this.linguaggi += linguaggio + " ";
	}	
	
	public static void main(String[] args) {
		var p1 = new Programmatore("vittorio", "stazi");
		var p2 = new Programmatore("antonio", "bianchi");
		p1.setAzienda("fincons");
		p2.setAzienda("");
		p1.addLinguaggio("C");
		p1.addLinguaggio("C++");
		System.out.println(p1.getLinguaggi());
	}
}

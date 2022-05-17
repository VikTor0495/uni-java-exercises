package it.metodologie.lezionetre;

public class Persona {

	private String nome;
	private String cognome;
	
	public Persona(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
	}
	
	public void stampa() {
		System.out.println("nome: " + nome + " cognome: " + cognome);
	}
	
	public static void main(String[] args) {
		
	}
	
}

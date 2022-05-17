package it.metodologie.lezionetre;

import java.util.Scanner;

public class ProgrammaInterattivo {
	public static void main(String[] args) {
		var in = new Scanner(System.in);
		
		System.out.println("come ti chiami?");
		var nome = in.nextLine();
		System.out.println("Ciao " + nome);
		
	}
}

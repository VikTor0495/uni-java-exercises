package it.metodologie.lezionedue;

public class Variabili {

	public static void main(String[] args) {
		var stringa = args[0];
		
		var intero = Integer.parseInt(stringa);
		
		double doub = intero/2;
		
		System.out.println(stringa);
		System.out.println(intero);
		System.out.println(doub);
		

	}

}

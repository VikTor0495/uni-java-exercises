package it.metodologie.lezionedue;

public class PhraseOMatic {

	public static void main(String[] args) {
		String[] v1 = { "salve", "ciao", "hello", "buongiorno", "scialla" };
		String[] v2 = { "egregio", "eclettico", "intelligentissimo", "astutissimo"};
		String[] v3 = { "studente", "ragazzo", "giovane", "scapestrato", "fannullone", "studioso" };
		
		String parola1 = v1[(int) (Math.round(Math.random() * (v1.length -1)))];
		String parola2 = v2[(int) (Math.round(Math.random() * (v2.length -1)))];
		String parola3 = v3[(int) (Math.round(Math.random() * (v3.length-1)))];
		
		System.out.println(parola1 + " " + parola2 + " " + parola3);
	}

}

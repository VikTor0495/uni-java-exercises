package it.metodologie.lezionetre;

public class BarraDiCaricamento {

	private double percentuale;

	public BarraDiCaricamento(double percentuale) {
		this.setPercentuale(percentuale);
	}

	public double getPercentuale() {
		return percentuale;
	}

	public void setPercentuale(double percentuale) {
		this.percentuale = percentuale;
	}

	public void incrementa(double percentuale) {
		this.percentuale += percentuale;
	}

	public String toString() {
		var perc = this.percentuale <= 100 ? this.percentuale : 100;
		var s = new StringBuilder("");
		
		var percRound = Math.round(perc);
		for( int i = 0; i < 10; i++ ) {
			s.append(i < percRound / 10 ? "=" : "-");
		}
		s.append("  " + percRound + "%");
		return s.toString();
		
	}
	
	public static void main(String[] args) {
		var b1 = new BarraDiCaricamento(0);
		b1.incrementa(20);
		b1.incrementa(100);
		System.out.println(b1.toString());
	}

}

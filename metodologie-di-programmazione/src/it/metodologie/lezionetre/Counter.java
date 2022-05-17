package it.metodologie.lezionetre;

public class Counter {
	
	private int value;
	
	public Counter() {
		value = 0;
	}

	public Counter(int i) {
		value = i;
	}
	
	public void reset() {
		value = 0;
	}
	
	public void increment() {
		value++;
	}
	
	public int getValue() {
		return value;
	}

	public static void main(String[] args) {
		Counter c = new Counter();
		
		c.increment();
		c.increment();
		System.out.println(c.getValue());
		
		c.reset();
		System.out.println(c.getValue());
	}
}

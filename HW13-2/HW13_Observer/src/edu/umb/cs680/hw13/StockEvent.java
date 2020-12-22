package edu.umb.cs680.hw13;

public class StockEvent {
	public String ticker;
	public float quote;

			public StockEvent(String t1, float q1) {
				this.ticker = t1;
				this.quote = q1;
			}
		
			public String getTicker() {
				return ticker;
			}
		
			public float getQuote() {
				return quote;
			}

	public static void main(String[] args) {
		System.out.println("StockEvent class has been Run");
	}
}

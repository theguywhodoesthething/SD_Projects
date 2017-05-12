package web;

public class Stock {
	private String symbol;
	private String name;
	private double price;
	private double openPrice;

	public Stock(String symbol, String name, double p) {
		this.symbol = symbol;
		this.name = name;
		this.price = p;
		this.openPrice = p;

		new Thread(new Runnable() {
			public void run() {
				while (true) {
					// Every two seconds adjust the price
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
					}
					// choose an amount to modify the price based on a 
					// random amount within 10% of the current price
					double adjustment = (Math.random() / 10);
					// randomly choose to raise or lower the price
					if (Math.random() < .5)
						price = openPrice * (1 - adjustment);
					else
						price = openPrice * (1 + adjustment);
				}
			}
		}).start();
	}

	public String getSymbol() {
		return symbol;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public double getOpenPrice() {
		return openPrice;
	}

	@Override
	public String toString() {
		return "Stock [symbol=" + symbol + ", name=" + name + ", price=" + price + "]";
	}
}

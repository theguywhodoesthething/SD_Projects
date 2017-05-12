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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((symbol == null) ? 0 : symbol.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Stock other = (Stock) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (symbol == null) {
			if (other.symbol != null)
				return false;
		} else if (!symbol.equals(other.symbol))
			return false;
		return true;
	}
}

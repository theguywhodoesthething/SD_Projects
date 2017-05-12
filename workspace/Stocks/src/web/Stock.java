package web;

public class Stock {
	private String symbol;
	private String name;
	private double price;
	
	public Stock(String symbol, String name, double price) {
		this.symbol = symbol;
		this.name = name;
		this.price = price;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price * (1 + (Math.random() / 10));
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Stock [symbol=" + symbol + ", name=" + name + ", price=" + price + "]";
	}
}

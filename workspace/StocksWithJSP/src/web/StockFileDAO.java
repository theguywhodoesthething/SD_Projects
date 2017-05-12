package web;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;

public class StockFileDAO implements StockDAO {
	private static final String filename = "WEB-INF/stocks.txt";
	private ServletContext servletContext;
	private List<Stock> stocks;

	public StockFileDAO(ServletContext context) {
		servletContext = context;
		stocks = new ArrayList<>();
		loadStocksFromFile();
	}

	private void loadStocksFromFile() {
		// Retrieve an input stream from the servlet context
		// rather than directly from the file system
		InputStream is = servletContext.getResourceAsStream(filename);
		try (BufferedReader buf = new BufferedReader(new InputStreamReader(is))) {
			String line;
			while ((line = buf.readLine()) != null) {
				String[] tokens = line.split(",");
				String symbol = tokens[0];
				String name = tokens[1];
				double price = Double.parseDouble(tokens[2]);
				stocks.add(new Stock(symbol, name, price));
			}
		} catch (Exception e) {
			System.err.println(e);
		}
	}

	@Override
	public Stock getStock(String symbol) {
		Stock s = null;
		for (Stock stock : stocks) {
			if (stock.getSymbol().equals(symbol)) {
				s = stock;
				break;
			}
		}
		return s;
	}

	@Override
	public double getPrice(String symbol) {
		Stock stock = getStock(symbol);
		if (stock != null) {
			return stock.getPrice();
		} else {
			return -1;
		}
	}

	@Override
	public String getName(String symbol) {
		Stock stock = getStock(symbol);
		if (stock != null) {
			return stock.getName();
		} else {
			return null;
		}
	}

	@Override
	public String getSymbol(String name) {
		String symbol = null;
		for (Stock stock : stocks) {
			if (stock.getName().equals(name)) {
				symbol = stock.getSymbol();
				break;
			}
		}
		return symbol;
	}

	@Override
	public List<Stock> getAllStocks() {
		return stocks;
	}
}

package data;

public class Item {
	private String upc;
	private double price;
	private String name;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((upc == null) ? 0 : upc.hashCode());
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
		Item other = (Item) obj;
		if (upc == null) {
			if (other.upc != null)
				return false;
		} else if (!upc.equals(other.upc))
			return false;
		return true;
	}

//	public Item(String upc, String name) {
//		this.upc = upc;
//		this.name = name;
//	}

	public Item(String upc, double price, String name) {
		this.upc = upc;
		this.price = price;
		this.name = name;
	}

	public Item(){}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Item [upc=");
		builder.append(upc);
		builder.append(", price=");
		builder.append(price);
		builder.append(", name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}

	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUpc() {
		return upc;
	}
	public void setUpc(String upc) {
		this.upc = upc;
	}
}

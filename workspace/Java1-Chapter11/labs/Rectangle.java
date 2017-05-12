package labs;

public class Rectangle extends Shape {

	private Double width;
	private Double heigth;
	
	public Rectangle(Color color, double width, double heigth) {
		super(color);
		this.width = width;
		this.heigth = heigth;
	}
	
	public Rectangle(double width, double heigth) {
		this(Color.RED, width, heigth);
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeigth() {
		return heigth;
	}

	public void setHeigth(double heigth) {
		this.heigth = heigth;
	}
	
	public double getArea() {
		return this.width * this.heigth;
	}
	
	public void draw() {
		System.out.println("You just drew a " + this.getColor() + " " + this.getClass());
	}
		
}

package labs;

public class Circle extends Shape {

	private Double radius;
	
	public Circle (Color color, double radius) {
		super(color);
		this.radius = radius;
	}
	
	public double getRadius(){
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return Math.PI * Math.pow(this.radius, 2);
	}

	
}

package labs;

public abstract class Shape implements Drawable{
	
	Color color;
	
	public Shape(Color color) {
		this.color = color;
	}
	
	public Color getColor(){
		return color;
	}
	
	public void setColor(Color color){
		this.color = color;
	}
	
	public abstract double getArea();
	
	public void draw() {
		System.out.println("You just drew a " + this.getColor() + " " + this.getClass());
	}
	
}

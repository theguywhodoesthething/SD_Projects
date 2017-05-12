package solutions;

public class Circle2 extends Shape2 {
    private int radius;

    public Circle2(int rad) {
        this(Color.WHITE, rad);
    }

    public Circle2(Color c, int rad) {
        super(c);
        radius = rad;
    }

    public void draw() {
        System.out.println("Draw circle in " + getColor());
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int r) {
        radius = r;
    }
}

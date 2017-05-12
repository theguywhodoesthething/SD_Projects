package solutions;

public abstract class Shape2 implements Drawable {
    private Color color;

    protected Shape2() {
        this(Color.WHITE);
    }

    protected Shape2(Color c) {
        color = c;
    }

    public abstract double getArea();

    public Color getColor() {
        return color;
    }

    public void setColor(Color c) {
        color = c;
    }
}

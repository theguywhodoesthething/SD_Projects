package solutions;

public abstract class Shape1 {
    private Color color;

    protected Shape1() {
        this(Color.WHITE);
    }

    protected Shape1(Color c) {
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

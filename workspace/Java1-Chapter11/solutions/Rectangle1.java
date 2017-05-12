package solutions;

public class Rectangle1 extends Shape1 {
    private int width;
    private int height;

    public Rectangle1(int w, int h) {
        this(Color.WHITE, w, h);
    }

    public Rectangle1(Color c, int w, int h) {
        super(c);
        width = w;
        height = h;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int w) {
        width = w;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int h) {
        height = h;
    }
}

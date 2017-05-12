package solutions;

public class Rectangle2 extends Shape2 {
    private int width;
    private int height;

    public Rectangle2(int w, int h) {
        this(Color.WHITE,w, h);
    }

    public Rectangle2(Color c, int w, int h) {
        super(c);
        width = w;
        height = h;
    }

    public void draw() {
        System.out.println("Draw rectangle in " + getColor());
    }

    @Override
    public double getArea() {
        return width * height;
    }

    public int getWidthd() {
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

package examples;

public class Triangle {
    private int side1;
    private int side2;
    private int side3;

    public Triangle(int s1, int s2, int s3) {
        // We don't allow negative or zero for the value of the sides
        if (s1 < 0 || s2 < 0 || s3 < 0)
            throw new IllegalArgumentException(
                    "A side cannot have a negative value");

        if (s1 == 0 || s2 == 0 || s3 == 0)
            throw new IllegalArgumentException(
                    "A side cannot have a zero value");

        // The length of two sides has to be greater than or equal to 
        // the third side for it to be a valid triangle
        if ((s1 + s2 <= s3) || (s1 + s3 <= s2) || (s2 + s3 <= s1))
            throw new IllegalArgumentException("This isn't a triangle");

        side1 = s1;
        side2 = s2;
        side3 = s3;
    }

    public boolean isEquilateral() {
        if (side1 == side2 && side2 == side3)
            return true;
        else
            return false;
    }

    public boolean isScalene() {
        if (side1 != side2 && side2 != side3 && side1 != side3)
            return true;
        else
            return false;
    }

    public boolean isIsosceles() {
        if ((side1 == side2 && side2 != side3)
                || (side1 == side3 && side2 != side3)
                || (side2 == side3 && side1 != side3))
            return true;
        else
            return false;
    }
}

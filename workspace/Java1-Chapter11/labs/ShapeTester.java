package labs;

public class ShapeTester {

	public static void main(String[] args) {

		int counter = 0;
		Drawable[] shapeArray = new Drawable[5];

		shapeArray[counter++] = new Circle(Color.BLUE, 67.9);
		shapeArray[counter++] = new Rectangle(Color.RED, 4.2, 5.6);
		shapeArray[counter++] = new Rectangle(Color.GREEN, 14.9, 6.6);
		shapeArray[counter++] = new Text("Yo");
		shapeArray[counter++] = new Rectangle(Color.GREEN, 14.9, 6.6);

		// for(Shape i : shapeArray) {
		// System.out.println("The area of this shape is " + i.getArea());
		// }

		for (Drawable i : shapeArray) {
			i.draw();
			if (i instanceof Shape)
			try {
			System.out.println("The area of this shape is " + ((Shape) i).getArea());
			} catch (ClassCastException e) {
				System.err.println("You have a class cast exception");
			}
		}

	}

}

package labs;

public class ReadFileImp {

	public static void main(String[] args) {
		
		ReadFile one = new ReadFile("presidents.csv", 1);
		ReadFile two = new ReadFile("presidents.csv", 2);
		ReadFile three = new ReadFile("presidents.csv", 3);
		
		one.start();
		two.start();
		three.start();

	}

}

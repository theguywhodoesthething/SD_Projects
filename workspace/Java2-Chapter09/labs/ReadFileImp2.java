package labs;

public class ReadFileImp2 {

	public static void main(String[] args) {
		
		ReadFile2 one = new ReadFile2("presidents.csv", 1);
		ReadFile2 two = new ReadFile2("presidents.csv", 2);
		ReadFile2 three = new ReadFile2("presidents.csv", 3);
		
		one.startThread();
		two.startThread();
		three.startThread();

	}

}

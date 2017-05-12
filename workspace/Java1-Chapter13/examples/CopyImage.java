package examples;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyImage {
	private byte[] byteArray;
	
	public static void main(String[] args) {
		CopyImage ci = new CopyImage("duke.png");
		ci.copyFile("java-mascot.png");
	}
	
	public CopyImage(String filename) {
		File file = new File(filename);
		byteArray = new byte[(int) file.length()];
		try {
			FileInputStream inputStream = new FileInputStream(file);
			inputStream.read(byteArray);
			inputStream.close();
		} catch (FileNotFoundException e) {
			System.out.println("Unable to find file.");
		} catch (IOException e) {
			System.out.println("IO error");
		}
	}
	
	public void copyFile(String filename) {
		if (byteArray != null) {
		try {
			FileOutputStream outputStream = new FileOutputStream(filename);
			outputStream.write(byteArray);
			System.out.println("Image copied to: " + filename);
			outputStream.close();
//		} catch (FileNotFoundException e) {
//			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println("IO error");
		}
		}
	}
	
}
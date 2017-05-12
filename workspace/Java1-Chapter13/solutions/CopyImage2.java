package solutions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyImage2 {
	private byte[] byteArray;

	public static void main(String[] args) {
		CopyImage2 ci = new CopyImage2("duke.png");
		ci.copyFile("java-mascot.png");
	}

	public CopyImage2(String filename) {
		File file = new File(filename);
		byteArray = new byte[(int) file.length()];
		try {
			FileInputStream inputStream = new FileInputStream(file);
			inputStream.read(byteArray);
			inputStream.close();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void copyFile(String filename) {
		if (byteArray != null) {
			try {
				FileOutputStream outputStream = new FileOutputStream(filename);
				outputStream.write(byteArray);
				System.out.println("Image copied to: " + filename);
				outputStream.close();
			} 
			catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

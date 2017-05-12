package solutions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyImage4 {
	private byte[] byteArray;

	public static void main(String[] args) throws IOException {
		CopyImage4 ci = new CopyImage4("duke.png");
		ci.copyFile("java-mascot.png");
	}

	public CopyImage4(String filename) throws IOException {
		File file = new File(filename);
		byteArray = new byte[(int) file.length()];
		FileInputStream inputStream = null;
		try {
			inputStream = new FileInputStream(file);
			inputStream.read(byteArray);
		} finally {
			if (inputStream != null) {
				inputStream.close();
			}
		}
	}

	public void copyFile(String filename) throws IOException {
		FileOutputStream outputStream = null;
		if (byteArray != null) {
			try {
				outputStream = new FileOutputStream(filename);
				outputStream.write(byteArray);
				System.out.println("Image copied to: " + filename);
			} finally {
				if (outputStream != null) {
					outputStream.close();
				}
			}
		}
	}
}

package solutions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyImage3 {
	private byte[] byteArray;

	public static void main(String[] args) {
		CopyImage3 ci = new CopyImage3("duke.png");
		ci.copyFile("java-mascot.png");
	}

	public CopyImage3(String filename) {
		File file = new File(filename);
		byteArray = new byte[(int) file.length()];
		FileInputStream inputStream = null;
		try {
			inputStream = new FileInputStream(file);
			inputStream.read(byteArray);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (inputStream != null) {
				try {
					inputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public void copyFile(String filename) {
		FileOutputStream outputStream = null;
		if (byteArray != null) {
			try {
				outputStream = new FileOutputStream(filename);
				outputStream.write(byteArray);
				System.out.println("Image copied to: " + filename);
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				if (outputStream != null) {
					try {
						outputStream.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
}

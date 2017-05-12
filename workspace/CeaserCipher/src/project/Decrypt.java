package project;

import java.util.concurrent.CountDownLatch;

public class Decrypt extends Thread implements Runnable{

	private String input = "";
	private int shift;
	private CountDownLatch latch;
	
	public String decrypting(String input, int userShift) {
		
		char character;
		String output = "";
		
		userShift %= 26;

		for (int i = 0; i < input.length(); i++) {
			
			character = input.charAt(i);
			
			if (character >= 'A' && character <= 'Z') {
				character -= userShift;
				if(character < 'A')
					character += 26;
			}
			else if (character >= 'a' && character <= 'z') {
				character -= userShift;
				if(character < 'a')
					character += 26;
			}
			
			output += character;

		}
		System.out.println(shift + " " + output);
		return output;
	}
	
	public void setShift(int shift){
		this.shift = shift;
	}
	public Decrypt() {}

	public Decrypt(String input) {
		this.input = input;
	}
	
	public Decrypt(CountDownLatch latch) {
		this.latch = latch;
	}

	@Override
	public void run() {
		
		
//		for(int i = 0; i < ThreadBruteForceDecrypt.NUM_OF_THREADS; i++) {
			decrypting(this.input, shift);
//		}
			
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		latch.countDown();
		
	}

}
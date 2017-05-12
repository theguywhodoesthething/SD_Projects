package project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadBruteForceDecrypt{
	
	public static final int NUM_OF_THREADS = 26;

	private static String userInputString = "";
	
	public static void main(String[] args) throws InterruptedException {
		
		CountDownLatch latch = new CountDownLatch(26);
		
		ExecutorService executor = Executors.newFixedThreadPool(26);
		
		Scanner kb = new Scanner(System.in);
	
		System.out.println("What message would you like to decrypt? ");
		userInputString = kb.nextLine();
		
		kb.close();
		
		List<Decrypt> list = new ArrayList<Decrypt>();
		for(int i = 1; i<= 26; i++){
			
			Decrypt decrypt = new Decrypt(userInputString);
			decrypt.setShift(i);
			list.add(decrypt);
			
		}

		for (Decrypt d : list) {
			d.start();
		}

		for(int i=0; i < 26; i++) {
	        executor.submit(new Decrypt(latch)); // ref to latch. each time call new Processes latch will count down by 1
	    }


	   try {
	        latch.await();  // wait untill latch counted down to 0
	    } catch (InterruptedException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	    }

	   System.out.println("Completed.");
	    }

	}





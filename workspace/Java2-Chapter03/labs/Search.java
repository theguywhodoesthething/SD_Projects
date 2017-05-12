package labs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Search {
	public static void main(String[] args) {
		
try {
			
			BufferedReader br = new BufferedReader(new FileReader(args[1]));
			String line = "";
			while ((line = br.readLine()) != null) {
				if (line.contains(args[0])){
					System.out.println(line);
				}
			}
			br.close();
		} catch (IOException e) {
			System.err.println(e);
			e.printStackTrace();
		}
		
	}
}

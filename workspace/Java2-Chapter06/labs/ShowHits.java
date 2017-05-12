package labs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ShowHits {

	public static void main(String[] args) {
		
		int totalHits = 0;
//		List<String> users = new ArrayList<>();
		Map<String, Integer> uVis = new HashMap<>();

		try (BufferedReader br = new BufferedReader(new FileReader("access_log"))) {
			
			String line = "";
			
			while ((line = br.readLine()) != null) {
				
				String[] ipAt0 = line.split(" - - ");

				if (!uVis.containsKey(ipAt0[0])){
					uVis.put(ipAt0[0], 1);
				} else {
					uVis.put(ipAt0[0], uVis.get(ipAt0[0])+1);
				}

				totalHits++;
			}
		} catch (Exception e) {
			System.err.println(e);
		}
		
		Set<String> key = uVis.keySet();
		
		for(String i : key) {
			System.out.println(i + ": #Hits: " + uVis.get(i));
		}
		
		System.out.println("Total Hits: " + totalHits);

	}

}

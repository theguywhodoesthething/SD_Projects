package labs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReadFile {

	public static void main(String[] args) throws IOException {

		try (BufferedReader br = new BufferedReader(new FileReader(args[1]))) {
			
//			List<String> sList = new ArrayList<>();
			String line = "";
			
			
			Pattern p = Pattern.compile(args[0]);
			Matcher m = p.matcher("");
			while ((line = br.readLine()) !=null) {
				m.reset(line);
				if (m.find()) {
					System.out.println(line);
				}
			}

		} catch (IOException e) {
			System.err.println(e);
		}

	}

}

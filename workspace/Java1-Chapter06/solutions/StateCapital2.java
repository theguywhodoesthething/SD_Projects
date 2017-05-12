package solutions;

public class StateCapital2 {
	public static void main(String[] args) {
		String[][] stateData = {
				{"Alabama", "Montgomery"},	
				{"Alaska", "Juneau"},	
				{"Arizona", "Phoenix"},	
				{"Arkansas", "Little Rock"},	
				{"California", "Sacramento"},	
				{"Colorado", "Denver"},	
				{"Connecticut", "Hartford"},	
				{"Delaware", "Dover"},	
				{"Florida", "Tallahassee"},	
				{"Georgia", "Atlanta"},	
				{"Hawaii", "Honolulu"},	
				{"Idaho", "Boise"},	
				{"Illinois", "Springfield"},	
				{"Indiana", "Indianapolis"},	
				{"Iowa", "Des Moines"},	
				{"Kansas", "Topeka"},	
				{"Kentucky", "Frankfort"},	
				{"Louisiana", "Baton Rouge"},	
				{"Maine", "Augusta"},	
				{"Maryland", "Annapolis"},	
				{"Massachusetts", "Boston"},	
				{"Michigan", "Lansing"},	
				{"Minnesota", "St. Paul"},	
				{"Mississippi", "Jackson"},	
				{"Missouri", "Jefferson City"},	
				{"Montana", "Helena"},	
				{"Nebraska", "Lincoln"},	
				{"Nevada", "Carson City"},	
				{"New Hampshire", "Concord"},	
				{"New Jersey", "Trenton"},	
				{"New Mexico", "Santa Fe"},	
				{"New York", "Albany"},	
				{"North Carolina", "Raleigh"},	
				{"North Dakota", "Bismarck"},	
				{"Ohio", "Columbus"},	
				{"Oklahoma", "Oklahoma City"},	
				{"Oregon", "Salem"},	
				{"Pennsylvania", "Harrisburg"},	
				{"Rhode Island", "Providence"},	
				{"South Carolina", "Columbia"},	
				{"South Dakota", "Pierre"},	
				{"Tennessee", "Nashville"},	
				{"Texas", "Austin"},	
				{"Utah", "Salt Lake City"},	
				{"Vermont", "Montpelier"},	
				{"Virgina", "Richmond"},	
				{"Washington", "Olympia"},	
				{"West Virginia", "Charleston"},	
				{"Wisconsin", "Madison"},	
				{"Wyoming", "Cheyenne"}	
		};
		
		java.util.Scanner keyboard = new java.util.Scanner(System.in);

		System.out.print("Please enter a state name: ");
		String name =  keyboard.next();
		keyboard.close();
		
		boolean match = false;
		for (int i = 0; i < stateData.length; i++) {
			if (stateData[i][0].startsWith(name)) {
				System.out.println(stateData[i][0] + "'s capital is " + stateData[i][1]);
				match = true;
			}
		}
		
		if (!match) {
			System.out.println("No match found!");
		}
	}

}

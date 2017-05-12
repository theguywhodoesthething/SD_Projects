package labs;

public class StateTest {
	public static void main(String[] args) {
		
		String[] names = {"Oregon", "Washington", "California", "Colorado", "Montana", "Idaho", "Oregon", "Colorado", "Colorado"};
		String[] abbr = {"OR", "WA", "CA", "CO", "MT", "ID", "OR", "CO", "CO"};
		String[] capital = {"Salem", "Olympia", "Sacramento", "Denver", "Helena", "Boise", "Salem", "Denver", "Denver"};
		Integer[] pop = new Integer[9];
		
		pop[0] = new Integer(100);
		pop[1] = new Integer(900);
		pop[2] = new Integer(200);
		pop[3] = new Integer(300);
		pop[4] = new Integer(400);
		pop[5] = new Integer(500);
		pop[6] = new Integer(600);
		pop[7] = new Integer(700);
		pop[8] = new Integer(800);
		
		State[] stateArr = new State[names.length];
		
		
		for (int i = 0; i < pop.length; i++) {
			stateArr[i] = new State(names[i], abbr[i], capital[i], pop[i]);
		}
		
		for (int i = 0; i < pop.length; i++) {
			System.out.println(stateArr[i]);
		}
		
		for (int i = 0; i < names.length; i++) {
			stateArr[i] = new State(names[i], abbr[i], capital[i]);
		}
		
		
		stateArr[2].setBird("California Quail");
		
		stateArr[0].setBird("Western Meadowlark");
		stateArr[0].setPopulation(3970000);
		
		stateArr[1].setBird("Willow Goldfinch");
		
		for (int i = 0; i < stateArr.length; i++) {
			System.out.println(stateArr[i]);
		}
		
		String highest = "The state with the highest population is ";
		int stateBig = -1, soBig = 0;
		
		for(int i = 0; i < stateArr.length; i++) {
			if (stateArr[i].getPopulation() > soBig)
				stateBig = i;
		}
		
		highest += stateArr[stateBig].getName();
		
		System.out.println(highest);
		
		for(int i = 0; i < (stateArr.length); i++){
			for(int j = i + 1; j < (stateArr.length); j++){
				System.out.println(stateArr[i] + " =? " + stateArr[j]);
				if (stateArr[i].equals(stateArr[j])) {
						System.out.println("************TRUE****************");
				}
			}
			System.out.println("\n");
		}
		
		
	
	}
}

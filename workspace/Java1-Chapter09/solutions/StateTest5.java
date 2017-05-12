package solutions;

public class StateTest5 {
	public static void main(String[] args) {
		State4[] states = new State4[10];
		states[0] = new State4("Alabama", "AL", "Montgomery", 4_849_000);
		states[1] = new State4("Alaska", "AK", "Juneau", 736_732);
		states[2] = new State4("Arizona", "AZ", "Phoenix", 6_731_000);
		states[3] = new State4("Arkansas", "AR", "Little Rock", 2_966_000);
		states[4] = new State4("California", "CA", "Sacramento", 38_800_000);
		states[5] = new State4("Colorado", "CO", "Denver", 5_356_000);
		states[6] = new State4("Connecticut", "CT", "Hartford", 3_597_000);
		states[7] = new State4("Delaware", "DE", "Dover", 935_614);
		states[8] = new State4("Florida", "FL", "Tallahassee", 19_890_000);
		states[9] = new State4("Georgia", "GA", "Atlanta", 10_100_000);

		State4 mostPopulous = states[0];
		for (int i = 1; i < states.length; i++) {
			if (mostPopulous.getPopulation() < states[i].getPopulation()) {
				mostPopulous = states[i];
			}
		}
		System.out.println(mostPopulous);
	}
}

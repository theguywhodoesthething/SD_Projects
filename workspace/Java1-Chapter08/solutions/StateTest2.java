package solutions;

public class StateTest2 {
	public static void main(String[] args) {
		State2[] states = new State2[10];
		states[0] = new State2("Alabama", "AL", "Montgomery", 4_849_000);
		states[1] = new State2("Alaska", "AK", "Juneau", 736_732);
		states[2] = new State2("Arizona", "AZ", "Phoenix", 6_731_000);
		states[3] = new State2("Arkansas", "AR", "Little Rock", 2_966_000);
		states[4] = new State2("California", "CA", "Sacramento", 38_800_000);
		states[5] = new State2("Colorado", "CO", "Denver", 5_356_000);
		states[6] = new State2("Connecticut", "CT", "Hartford", 3_597_000);
		states[7] = new State2("Delaware", "DE", "Dover", 935_614);
		states[8] = new State2("Florida", "FL", "Tallahassee", 19_890_000);
		states[9] = new State2("Georgia", "GA", "Atlanta", 10_100_000);

		for (State2 state : states) {
			state.display();
		}
	}
}

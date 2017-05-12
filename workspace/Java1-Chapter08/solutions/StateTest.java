package solutions;

public class StateTest {
	public static void main(String[] args) {
		State alabama = new State("Alabama", "AL", "Montgomery");
		State alaska = new State("Alaska", "AK", "Juneau");
		State arizona = new State("Arizona", "AZ", "Phoenix");
		State arkansas = new State("Arkansas", "AR", "Little Rock");
		
		alaska.setPopulation(736_732);
		alaska.setStateBird("Willow Ptarmigan");
		
		alabama.display();
		alaska.display();
		arizona.display();
		arkansas.display();
	}
}

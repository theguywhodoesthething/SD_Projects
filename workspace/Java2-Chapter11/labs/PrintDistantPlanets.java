package labs;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PrintDistantPlanets {
	public static void main(String[] args) {
		
		List<Planet> planets = new ArrayList<>(PlanetUtilities.getPlanets());
		List<Planet> distantPlanets;
		List<Planet> nearPlanets;
		
//		distantPlanets = PlanetUtilities.filterPlanet(planets, (a) -> a.getOrbit() > 2e8);
//		nearPlanets = PlanetUtilities.filterPlanet(planets, (a) -> a.getOrbit() < 2e8);
		
		
		
		System.out.println(distantPlanets.toString());
		System.out.println(nearPlanets.toString());
	}
}
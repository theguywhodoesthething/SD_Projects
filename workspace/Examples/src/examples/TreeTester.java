package examples;

import java.util.Set;
import java.util.TreeSet;

public class TreeTester {

	public static void main(String[] args) {

		Set<Integer> tSet = new TreeSet<>();
		
		tSet.add(4);
		tSet.add(14);
		tSet.add(11);
		tSet.add(5);
		
		Set<String> stringSet = new TreeSet<>();
		
		stringSet.add("ABC");
		stringSet.add("aardvark");
		stringSet.add("zoom!");
		stringSet.add("Zebra");
		stringSet.add("ZOOOOM");
		stringSet.add("01234");
		stringSet.add("98765");
	}

}

package labs;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Numbers {
	
	static DecimalFormat df = new DecimalFormat("#.###");

	public static void main(String[] args) {

		ArrayList<Double> numList = new ArrayList<>();
		
		for (int i = 0; i < 10; i++) {
			numList.add(Math.random());
		}
		
		
		
		
		System.out.println(bubbleSort(numList));

	}

	public static ArrayList<Double> bubbleSort(ArrayList<Double> numList) {
		for (int i = 0; i < numList.size()-1; i++) {
			Double big, small;
			if (numList.get(i+1) > numList.get(i)) {
				big = numList.get(i+1);
				small = numList.get(i);
				numList.set(i, big);
				numList.set(i+1, small);
				i = -1;
			}
		}
		return numList;
	}
	
	public static ArrayList<Double> efficientSort(ArrayList<Double> numList) {
		
		ArrayList<Double> newList = new ArrayList<>();
		double biggestSoFar = Double.MIN_NORMAL;
		
		for(int i = 0; i < numList.size(); i++) {
			if (numList.get(i) > biggestSoFar) {
				newList.set(i, numList.get(i));
				numList.remove(i);
			}
		}
		return newList;
	}
}

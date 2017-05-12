package data;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NumberGeneratorDAOImpl implements NumberGeneratorDAO {


	@Override
	public List<Integer> getLuckyNumbers(int range, int amount) {
		List<Integer> luckyNums = new ArrayList<>();

		if (range < amount) {
			luckyNums = null;
			return luckyNums;
		} else {
			for (int i = 0; i < amount; i++) {
				int rando;
				Random r = new Random();
				rando = r.nextInt(range + 1);
				if (luckyNums.contains(rando)) {
					i -= 1;
					continue;
				} else {
					luckyNums.add(rando);
				}
			}
			return luckyNums;
		}
	}

}

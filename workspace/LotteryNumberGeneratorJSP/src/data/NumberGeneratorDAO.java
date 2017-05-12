package data;

import java.util.List;

public interface NumberGeneratorDAO {
	public List<Integer> getLuckyNumbers(int range, int amount);
}

package data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ItemDAOMemoryImpl implements ItemDAO {
	Map<String,Item> inventory = new HashMap<>();
	
	public ItemDAOMemoryImpl(){
		this.loadItemsIntoInventory();
	}
	
	private void loadItemsIntoInventory() {
		inventory.put("123", new Item("123", 0.5, "Banana"));
		inventory.put("234", new Item("234", 0.2, "Apple"));
		inventory.put("345", new Item("345", 0.55, "Orange"));
		inventory.put("456", new Item("456", 5, "Pineapple"));
		inventory.put("567", new Item("567", 0.25, "Grapes"));
		inventory.put("678", new Item("678", 0.7, "Pear"));
		inventory.put("789", new Item("789", 2, "Kumquat"));
	}

	@Override
	public Item getItem(String upc) {
		return inventory.get(upc);
	}

	@Override
	public List<Item> getInventory() {
		return new ArrayList<>(inventory.values());
	}

}

package data;

import java.util.List;

public interface ItemDAO {
//	boolean addItem(Item item);
	Item getItem(String upc);
	List<Item> getInventory();
}

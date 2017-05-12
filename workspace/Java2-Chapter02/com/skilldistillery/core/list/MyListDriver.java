package com.skilldistillery.core.list;

public class MyListDriver {

	public static void main(String[] args) {
		MyList list = new MyList();
		list.add(new Integer(155));
		list.add("String");
		
		MyListGeneric<String> mlgStrings = new MyListGeneric<String>();
		
		MyListGeneric<Integer> mlgInts = new MyListGeneric<>();
		
//		mlgStrings.add(new Integer(53));
				
		for(int i = 0; i < 2; i++) {
			Object o = list.get(i);
			if (o instanceof Integer) {
				int intValue = ((Integer) o).intValue();
			
			}
			else if (o instanceof String) {
				int StringLength = ((String)o).length();
			}
			
		}
	}

}

package com.skilldistillery.core.list;

// Class that represents and array, but grows as necessary.
// @author mgmur

public class MyList {
	
//	Members
	
	private int size = 0;
	private Object[] objs;
	
//	Constructors
	
	public MyList() {
		objs = new Object[20];
	}
	
	public MyList(Object[] objs) {
		this();
		objs[size++] = objs;
		this.objs = objs;
	}
	
	
	public boolean add(Object obj) {
		growArrayIfNecessary();
		return true;
	}

	public Object get(int index) {
		return objs[index];
	}
	
	private void growArrayIfNecessary() {
//		if current size is 2/3 of the array length, double size
		if(objs.length * (2.0f/3.0f) < size) {
//			grow
			Object[] temp = objs;
			objs = new Object[temp.length * 2];
			for(int i = 0; i < temp.length; i++) {
				objs[i] = temp[i];
			}
		}
	}
}
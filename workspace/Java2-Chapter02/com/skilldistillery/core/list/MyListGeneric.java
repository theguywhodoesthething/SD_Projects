package com.skilldistillery.core.list;

public class MyListGeneric <E> {
	
//	Members
	
	private int size = 0;
	private Object[] objs;
	
//	Constructors
	
	public MyListGeneric() {
		objs = new Object[20];
	}
	
	@SuppressWarnings("unchecked")
	public MyListGeneric(E[] objs) {
		this();
		objs[size++] = (E)objs;
		this.objs = objs;
	}
	
	
	public boolean add(E obj) {
		growArrayIfNecessary();
		return true;
	}
	
	@SuppressWarnings("unchecked")
	public E get(int index) {
		return (E)objs[index];
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
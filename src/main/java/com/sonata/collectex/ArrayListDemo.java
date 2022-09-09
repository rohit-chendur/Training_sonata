package com.sonata.collectex;

import java.util.ArrayList;

public class ArrayListDemo {
	
	ArrayList arr = new ArrayList();
	
	public void add(int element) {
		arr.add(element);
	}
	
	public void delete(int element) {
		arr.remove(element);
	}
	
	public int getsize() {
		return arr.size();
	}

}

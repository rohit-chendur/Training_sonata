package com.sonata.ThreadEx;

public class SyncEx {

	public static void main(String[] args) {
		
		ClassOne s1 = new ClassOne();
		ClassTwo ob = new ClassTwo(s1);
		ClassThree obj = new ClassThree(s1);
		ob.start();
		obj.start();
	}

}

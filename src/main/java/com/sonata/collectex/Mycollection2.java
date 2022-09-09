package com.sonata.collectex;

import java.util.*;

public class Mycollection2 {

	public static void main(String[] args) {
		ArrayList l1 = new ArrayList();
		l1.add("abc");
		l1.add("Rohit");
		l1.add("Rohit");
		int age = 21;
		l1.add(age);
		System.out.println(l1);
		
		LinkedList l2 = new LinkedList(l1);
		l2.addFirst("abc1");
		l2.addLast("abc-last");
		System.out.println(l2);
		l2.removeLast();
		System.out.println(l2);
		
		HashSet h1 = new HashSet(l2);
		h1.add("abc2");
		h1.add("abc3");
		h1.add("abc1");
		System.out.println(h1);
		
		TreeSet t1 = new TreeSet(h1);
		t1.add("abc-last");
		System.out.println(t1);

	}

}

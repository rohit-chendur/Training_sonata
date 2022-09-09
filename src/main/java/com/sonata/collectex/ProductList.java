package com.sonata.collectex;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ProductList {

	public static void main(String[] args) {
		
		List<Product> p1 = new LinkedList<Product>();
		p1.add(new Product(456,"Chair",4500));
		p1.add(new Product(561,"Headphone",2300));
		p1.add(new Product(751,"Pen",560));
		
		for (Product p2:p1){
			System.out.println(p2.proID + " " + p2.proName + " Rs." + p2.proPrice);
		}
		
		LinkedList<String> l1 = new LinkedList<String>();
		
		l1.add("Rohit");
		l1.add("is working");
		l1.add("at Sonata");
		System.out.println(l1);
		
		Iterator<String> i1 = l1.iterator();
		while (i1.hasNext()) {
			System.out.println(i1.next());
		}
		
		
	}

}

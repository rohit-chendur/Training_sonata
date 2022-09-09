package com.sonata.aug26;

public class BankImpl {

	public static void main(String[] args) {
		BankIntf b1 = (a,b) -> {return a+b;};
		BankIntf b2 = (c,d) -> {
			if (c+d>50) {
				return c+d+1;	
			} else {
			return c+d-1;}
		};
		
		System.out.println(b1.add(10,20));
		System.out.println(b2.add(25,5));
	}

}

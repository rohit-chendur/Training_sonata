package com.sonata.ThreadEx;

public class ClassThree extends Thread{
	ClassOne d;
	ClassThree(ClassOne d){
		this.d=d;
	}
	public void run() {
		d.print(5);
	}
}

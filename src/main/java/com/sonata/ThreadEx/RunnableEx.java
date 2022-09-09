package com.sonata.ThreadEx;

public class RunnableEx implements Runnable{
	public void run() {
		try {
			System.out.println("Thread " + Thread.currentThread().getId() + " is running at priority: " + Thread.currentThread().getPriority());
		}catch(Exception e){
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		RunnableEx r1 = new RunnableEx();
		Thread t1 = new Thread(r1);
		t1.start();
	}

}

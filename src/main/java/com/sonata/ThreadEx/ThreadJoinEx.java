package com.sonata.ThreadEx;

public class ThreadJoinEx extends Thread{
	
	ThreadJoinEx(String s){
		super(s); //super method passes parameter value to superclass
	}
	
	public void run() {
		for(int i=1;i<5;i++) {
			try {
				System.out.println("waiting...");
				Thread.sleep(2000);
				System.out.println("Thread executing" + Thread.currentThread());
				Thread.sleep(500);
			}catch(Exception e) {
				System.out.println(e);
			}
		}
	}
	
	public static void main(String[] args) throws InterruptedException{
		ThreadJoinEx t1 = new ThreadJoinEx("one");
//		ThreadJoinEx t2 = new ThreadJoinEx("two");
//		ThreadJoinEx t3 = new ThreadJoinEx("three");
		
		t1.start();
		t1.join();
		
//		t2.start();
//		t3.start();
	}

}

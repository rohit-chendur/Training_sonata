package com.sonata.aug26;

public class LambdaClass{
	
	/* implements Lambdainterface
	@Override
	public int subtract(int a, int b){
		return 0;
	}
	*/
	public static void main(String[] args) {
		/*
		LambdaClass l1 = new LambdaClass();
		
		l1.subtract(10,20);
		 
		
		Lambdainterface l2 = (input) -> System.out.println("Sum: " + input);
		c1.sum(10);
		same can be written in different way
		*/
		
		Lambdainterface li1 = (a,b) -> {return b-a;};
		Lambdainterface li2 = (a,b) -> {
			if(a>b) {
				throw new RuntimeException("message");
			} else {return b-a;}};
			
			System.out.println(li1.subtract(10,20));
			System.out.println(li2.subtract(2,5));
}
}
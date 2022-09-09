package com.sonata.aug26;

public interface Machine {
	//car speed alarm
	String speedup();
	String speeddown();
	
	default String alarmOn(){
		return "Turning vehicle alarm on";
	}
	default String alarmOff() {
		return "Turning vehicle alarm off"; 
	}
}

package com.sonata.MyServiceTest;

import java.util.List;

import com.sonata.MyService.MyServiceIntf;

import java.util.Arrays;

public class MyServiceStub implements MyServiceIntf{
	//two problems using stub are
	//Dynamic condition
	//Service definitions are problematic
	
	@Override
	public List<String>retrieveUsers (String user){
		return Arrays.asList("Learn Spring MVC","Learn Spring","Learn to Dance");
	}
}

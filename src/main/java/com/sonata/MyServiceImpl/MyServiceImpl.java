package com.sonata.MyServiceImpl;

import java.util.ArrayList;
import java.util.List;

import com.sonata.MyService.MyServiceIntf;

//MyServiceImpl is System under test
//MyServiceIntf is the dependency
public class MyServiceImpl {
	
	private MyServiceIntf myService;
	
	MyServiceImpl(){}
	MyServiceImpl(MyServiceIntf mySer){
		this.myService = mySer;
	}
	
	public List <String> retrieverelated (String user){
		List<String>filteredValue = new ArrayList<String>();
		List<String>allToDo = myService.retrieveUsers(user);
		for (String all : allToDo){
			if(all.contains("Spring")) {
				filteredValue.add(all);
			}
		}
		return filteredValue;
	}
}

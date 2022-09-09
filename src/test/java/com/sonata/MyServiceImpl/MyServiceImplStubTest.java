package com.sonata.MyServiceImpl;

import java.util.List;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

import com.sonata.MyService.MyServiceIntf;
import com.sonata.MyServiceTest.MyServiceStub;

public class MyServiceImplStubTest {
	
	@Test
	void test() {
		MyServiceIntf my = new MyServiceStub();
		MyServiceImpl mys = new MyServiceImpl(my);
		List<String>filterMySer = mys.retrieverelated("Dummy");
		assertEquals(2, filterMySer.size());
	}
}

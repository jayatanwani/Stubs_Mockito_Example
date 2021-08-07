package com.demo.mockito.mockitodemo;

import static org.junit.Assert.*;

import org.junit.Test;

public class SomeBusinessStubTest {

	@Test
	public void testFindTheGreatestNumberFromAllData() {
		SomeBusinessImpl someBusinessImpl = new SomeBusinessImpl(new DataServiceStub());
		int actual = someBusinessImpl.findTheGreatestNumberFromAllData();
		assertEquals(4,actual);
	}

}

class DataServiceStub implements DataService{

	@Override
	public int[] RetrieveNumbers() {
		return new int[] {1,2,3,4};
	}
}

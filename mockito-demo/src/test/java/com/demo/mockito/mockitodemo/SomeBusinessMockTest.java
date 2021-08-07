package com.demo.mockito.mockitodemo;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

public class SomeBusinessMockTest {

	@Test
	public void testFindTheGreatestNumberFromAllData() {
		DataService dataServiceMock = mock(DataService.class);
		//dataServiceMock.RetrieveNumbers() => new int[] {1,2,3}
		
		when(dataServiceMock.RetrieveNumbers()).thenReturn(new int[] {1,2,3,4});
		
		SomeBusinessImpl someBusinessImpl = new SomeBusinessImpl(dataServiceMock);
		int actual = someBusinessImpl.findTheGreatestNumberFromAllData();
		assertEquals(4,actual);
	}
	
	@Test
	public void testFindTheGreatestNumberFromAllDataForOneValue() {
		DataService dataServiceMock = mock(DataService.class);
		//dataServiceMock.RetrieveNumbers() => new int[] {1}
		
		when(dataServiceMock.RetrieveNumbers()).thenReturn(new int[] {1});
		
		SomeBusinessImpl someBusinessImpl = new SomeBusinessImpl(dataServiceMock);
		int actual = someBusinessImpl.findTheGreatestNumberFromAllData();
		assertEquals(1,actual);
	}

}


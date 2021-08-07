package com.demo.mockito.mockitodemo;

import static org.junit.Assert.*;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class SomeBusinessMockAnnotationsTest {
	
	@Mock
	DataService dataServiceMock;
	
	@InjectMocks
	SomeBusinessImpl someBusinessImpl;

	@Test
	public void testFindTheGreatestNumberFromAllData() {
		//dataServiceMock.RetrieveNumbers() => new int[] {1,2,3}
		
		when(dataServiceMock.RetrieveNumbers()).thenReturn(new int[] {1,2,3,4});
		
		int actual = someBusinessImpl.findTheGreatestNumberFromAllData();
		assertEquals(4,actual);
	}
	
	@Test
	public void testFindTheGreatestNumberFromAllDataForOneValue() {
		
		//dataServiceMock.RetrieveNumbers() => new int[] {1}
		
		when(dataServiceMock.RetrieveNumbers()).thenReturn(new int[] {1});
		
		int actual = someBusinessImpl.findTheGreatestNumberFromAllData();
		assertEquals(1,actual);
	}

}


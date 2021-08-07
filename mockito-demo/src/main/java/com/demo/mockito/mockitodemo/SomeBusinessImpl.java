package com.demo.mockito.mockitodemo;

public class SomeBusinessImpl {
	private DataService dataService;
	
	public SomeBusinessImpl(DataService dataService) {
		super();
		this.dataService = dataService;
	}

	public int findTheGreatestNumberFromAllData() {
		int[] numbers = dataService.RetrieveNumbers();
		int greatest = Integer.MIN_VALUE;
		for (int i : numbers) {
			if(i>greatest) {
				greatest=i;
			}
		}
		return greatest;
	}
}

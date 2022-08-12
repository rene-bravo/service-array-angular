package com.example.angular.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.angular.service.TestService;

@Service
public class TestServiceImpl implements TestService{

	@Override
	public List<String> countRepeatedNumberInArray(String[] arrayOne, String[] arrayTwo) {
		List<String> countRepeatedNumberInArray = new ArrayList<>();
		for(int i = 0; i<arrayTwo.length; i++) {
			int count = 0;
			for(int j = 0; j<arrayOne.length; j++) {
				if(arrayTwo[i].equals(arrayOne[j])) {
					count++;
				}
			}
			countRepeatedNumberInArray.add(arrayTwo[i] + "-"+ count);
		}
		return countRepeatedNumberInArray;
	}

}

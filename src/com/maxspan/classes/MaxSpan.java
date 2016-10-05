package com.maxspan.classes;

import java.util.ArrayList;

public class MaxSpan {

	public int maxSpan(int[] intArr){
	
		ArrayList<Integer> intList = new ArrayList<Integer>();
		int max = 0;
		int temp = 0;
		for (int i = 0; i < intArr.length; i++)
			intList.add(intArr[i]);
		
		for (int j = 0; j < intList.size(); j++){
			temp = intList.lastIndexOf(intList.get(j)) - intList.indexOf(intList.get(j)) + 1;
			if (temp > max)
				max = temp;
		}
		return max;
	}
}

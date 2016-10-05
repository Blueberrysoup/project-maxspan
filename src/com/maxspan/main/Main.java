package com.maxspan.main;
import com.maxspan.classes.MaxSpan;

public class Main {

	public static void main(String[] args) {
		MaxSpan max = new MaxSpan();
		int[] intArr = {2,8,-1,-1,0,2,4,5,7,8,7,6,5};
		int result = max.maxSpan(intArr);
		
		System.out.println("Största span är: " + result);

	}

}

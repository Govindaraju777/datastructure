package com.friends.sapiensInt;

import java.util.Arrays;
import java.util.List;

public class Program24 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(4, 16, 66, 3);

		String s = list.stream().map(i -> {
			return "" + (i + 1);
		}).reduce("", String::concat);
		System.out.println(s);
	}
	
	
	//
	
	
	/*
	 //output 
	  * 4612663
	  * 5713674
	  * 3661264
	  * 
	  
	 */
}

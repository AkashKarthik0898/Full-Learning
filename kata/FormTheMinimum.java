package com.kata;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Consumer;
public class FormTheMinimum {

	public static int minValue(int[] values){
		
		
		Set<Integer> set = new TreeSet<>();
		for(int i:values)
			set.add(i);
		int i = 0;
		for(int x : set)
			i = (i*10)+x;
		return i;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(minValue(new int[] {1,3,1}));
		System.out.println(minValue(new int[] {4, 7, 5, 7}));
		
	}

}

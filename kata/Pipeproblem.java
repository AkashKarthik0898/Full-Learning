package com.kata;

import java.util.ArrayList;
import java.util.List;

public class Pipeproblem {

	 public static int[] pipeFix(int[] numbers) {
		  
 		List<Integer> list = new ArrayList<>();
		for(int i = numbers[0] ; i<numbers[numbers.length-1]+1 ; i++)
			list.add(i);
		int[] res = list.stream().mapToInt(i->i).toArray();
		
		for(int i : res)
			System.out.println(i);
		
		return res;
 
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(pipeFix(new int[] {1,2,3,5,6,8,9}));
		System.out.println(pipeFix(new int[] {1,2,3,12}));
		
		
		
	}

}

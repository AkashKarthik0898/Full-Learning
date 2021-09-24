package com.kata;

public class HighestScoringWord {

	public static String high(String s) {
		// Your code here...
		String[] str = s.split(" ");
		long[] size = new long[str.length];
		long max = 0;
		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str[i].length(); j++)
				size[i] +=  str[i].charAt(j);

		}
		for (int i = 1; i < str.length; i++) {
			if (size[(int) max] < size[i])
				max = i;
		}

		return str[(int) max];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(high("man i need a taxi up to ubud"));
		System.out.println(high("what time are we climbing up to the volcano"));
		System.out.println(high("take me to semynak"));
	}

}

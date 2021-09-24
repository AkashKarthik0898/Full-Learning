package com.kata;

public class Mumbling {
	
	public static String accum(String s) {
		char[] c = s.toCharArray();
		String newString = String.valueOf(c[0]).toUpperCase() + "-";
		for (int i = 1; i < c.length; i++) {

			int count = 1;
			for (int j = 0; j <= i; j++) {
				if (count == 1) {
					newString += String.valueOf(c[i]).toUpperCase();
					count++;
				} else {
					newString += String.valueOf(c[i]).toLowerCase();
				}
			}
			newString += "-";
		}

		return newString.substring(0, newString.length() - 1);
	}
	public static void main(String[] args) {

		System.out.println(accum("ZpglnRxqenU"));
		System.out.println(accum("NyffsGeyylB"));
		System.out.println(accum("MjtkuBovqrU"));
	}

}

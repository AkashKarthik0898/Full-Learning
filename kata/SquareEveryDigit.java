package com.kata;

public class SquareEveryDigit {
	
	

	public static int squareDigits(int n) {
		StringBuilder str = new StringBuilder();
		String input = String.valueOf(n);
		StringBuilder sb = new StringBuilder();
		sb.append(input).reverse();
		int x = Integer.parseInt(new String(sb));
		System.out.println(x);
		
//		
		for(int i =0 ; i<input.length();i++) {
			
			int temp = (int)Math.pow(x%10, 2);
			str.append(temp);
			x = x/10;
		}
		
		return Integer.parseInt(new String(str));
		
		
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(squareDigits(415));
	}

}

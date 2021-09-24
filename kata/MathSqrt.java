package com.kata;

public class MathSqrt {
	public static void main(String[] args) {
		int n =3;
		
		int x= (int)Math.sqrt(n);
		System.out.println(x);
		if(n==0 || n==1 || (x!=0 && x!=1 && n%x == 0))
			System.out.println("true");
		else
			System.out.println("false");
	}
}

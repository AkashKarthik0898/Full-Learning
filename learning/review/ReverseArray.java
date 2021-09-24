package com.learning.review;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NewClass obj = new NewClass();
		obj.display();
		NewClass.x = 20;
		System.out.println(NewClass.x);
		obj.display();

		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] reversed = reversedArray(array);
		for (int i : reversed)
			System.out.println(i);

	}

	public static int[] reversedArray(int[] array) {

		int j = array.length - 1;
		int[] arrayReversed = new int[array.length];
		for (int i : array)
		{
			arrayReversed[j] = i;
			j--;
		}
			return arrayReversed;

	}
}

class NewClass {
	public static int x = 9;

	
	public static void main(String[] args) {
		System.out.println("Hello");
	}
	public void display() {
		System.out.println(x);
	}
}
package com.learning.cubicnumber;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CubicInList {

	public static void cubicInList(int dimension, List<Double> list) {

		List<Double> newList = list.stream().filter( t -> Math.cbrt(t)%1 == 0).collect(Collectors.toList());
		System.out.println(newList.size());
	}

	public static void main(String[] args) {

		int dimension;
		Scanner scan = new Scanner(System.in);
		List<Double> list = new ArrayList<>();
		System.out.println("Enter the dimension: ");
		dimension = scan.nextInt();
		System.out.println("Enter the list of values:");
		for(int i = 0; i<dimension;i++)
			list.add(scan.nextDouble());
		cubicInList(dimension, list);
		scan.close();
	}

}

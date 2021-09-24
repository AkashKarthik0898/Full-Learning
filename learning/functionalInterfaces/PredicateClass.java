package com.learning.functionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateClass {

	public static void main(String[] args) {
		Predicate<String> predicate = new Predicate<String>() {
			
			@Override
			public boolean test(String t) {// Predicate returns boolean

				return t.contains("ak");
			}
		};
		
		List<String> list = Arrays.asList("akash", "karthik", "mohan", "raj", "bharath");
		list.stream()
			.filter(predicate)
			.forEach(System.out::println);
		
//		list.stream()
//		.filter(t -> t.contains("ak"))
//		.forEach(System.out::println);  The same in lambda
		;
	}

}

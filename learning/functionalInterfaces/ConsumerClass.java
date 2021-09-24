package com.learning.functionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerClass {

	public static void main(String[] args) {
		
		Consumer<String> consumer = new Consumer<String>() {	//Consumer is a terminal fn so no return.
			@Override
			public void accept(String t) {
				System.out.println(t);
				
			}
		};
		
		List<String> list = Arrays.asList("akash", "karthik", "mohan", "raj", "bharath");
		list.stream()
			.forEach(consumer);

		list.stream().forEach(s -> System.out.println(s)); // Same in lambda
		list.stream().forEach(System.out::println);//Same using a higher order function 
		
	}

}

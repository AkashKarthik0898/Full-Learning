package com.learning.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = Arrays.asList("akash", "aakash", "karthik", "mohan", "jeshwanth", "aaakash", "bharath");
		System.out.println("Unsorted parallel Stream");
		list.parallelStream().forEach(System.out::println); // Since ||el stream, first item to complete process is the
															// first item in the list
		System.out.println("\n");

		System.out.println("Unsorted normal Stream");
		list.stream().forEach(System.out::println);
		System.out.println("\n");
		
		Stream<String> stream = list.stream(); // Create a stream

		stream.filter(s -> list.contains(s)) // Non-terminal operation
				.map(t -> t.toString()) // Non-terminal Operation
				.forEach(System.out::println); // Terminal operation - returns nothing and terminats the stream

		System.out.println("\n");
		List<String> li = list.stream().filter(s -> s.contains("ak")).map(t -> t.toString())
				.collect(Collectors.toList());// collect is a terminal operation that collects the data into a list
		System.out.println(li.toString());

	}

	/*
	 * As the stream is a parallel stream,sorting the stream is not possible as the
	 * parallel stream execution happens at the same time and the core that
	 * completes the process first returns the data out of the stream first and the
	 * order is not preserved. To achieve sorting use normal stream or try collecting the list as a tree set
	 */
	public void parallelSortedStream(List<String> list) {
		System.out.println("Sorted Parallel Stream using sorted()"); 
		list.parallelStream().sorted().forEach(System.out::println);
		System.out.println("\n");

		System.out.println("Sorted Parallel Stream using Comparator argument");
		list.parallelStream().sorted((String o1, String o2) -> o1.compareTo(o2)).forEach(System.out::println);
		System.out.println("\n");

	}
	
	
	/*
	 * sorting in a normal stream is easy to achieve in a stream that is not
	 * parallel. Using the methods sorted(),sorted(Comparator<>)
	 */
	public void sortedStream(List<String> list)
	{
		System.out.println("Sorted Normal Stream using sorted()");
		list.stream().sorted().forEach(System.out::println);
		System.out.println("\n");
		System.out.println("Sorted using comparator argument");
		list.stream().sorted((s1, s2) -> s1.compareTo(s2)).forEach(System.out::println);
		System.out.println("\n");

	}

}

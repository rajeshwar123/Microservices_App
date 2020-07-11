package com.rg.java8;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamApiEx {

	public static void main(String[] args) {
		// Count empty strings
		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");

		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

		// Java 8

		// count empty string
		long count1 = strings.stream().filter(str -> str.isEmpty()).count();
		System.out.println("Empty String Count :" + count1);

		// count strings whose length is 3
		long count2 = strings.stream().filter(str -> str.length() == 3).count();
		System.out.println(count2);

		// filter non-empty Strings
		List<String> filtered = strings.stream().filter(str -> !str.isEmpty()).collect(Collectors.toList());

		System.out.println("Non-Empty Strings :" + filtered);

		// merge Strings by ,(comma)
		String mergedStrins = strings.stream().filter(str -> !str.isEmpty()).collect(Collectors.joining(", "));
		System.out.println(mergedStrins);

		// get list of square of distinct numbers
		List<Integer> squareList = numbers.stream().map(num -> num * num).distinct().collect(Collectors.toList());
		System.out.println(squareList);
		
		List<Integer> integers = Arrays.asList(1, 2, 13, 4, 15, 6, 17, 8, 19);
		System.out.println(integers);
		
		IntSummaryStatistics stats=  integers.stream().mapToInt((x) -> x ).summaryStatistics();
       
		System.out.println("Highest Number in the List :"+stats.getMax());
		System.out.println("Minimum Number in the List :"+stats.getMin());

		System.out.println("Sum of All Numbers :"+stats.getSum());
		System.out.println("Average of All Numbers :"+stats.getAverage());
		
		//generate Random numbers
		System.out.println("Random Numbers");
		
		Random ran=new Random();
		
		 ran.ints().distinct().limit(20).sorted().forEach(System.out::println);

		 //Parallal Processing
		 long count = strings.parallelStream().filter(str->str.isEmpty()).count();
		 System.out.println(count);
	}

}

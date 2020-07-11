package com.nt.Array2;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author rgodw
 *
 */
/**
 * @author rgodw
 *
 */
/**
 * @author rgodw
 *
 */
/**
 * @author rgodw
 *
 */
public class Java8Features {

	public static void main(String[] args) {
		List<String> elements = Stream.of("l","d","a", "b", "c","b").filter(m->m.contains("b"))
				.collect(Collectors.toList());
		
		System.out.println(elements);
		Optional<String> anyElement = elements.stream().findAny();
		System.out.println(anyElement);
		Optional<String> firstElement = elements.stream().findFirst();
		System.out.println(firstElement);
	}

}

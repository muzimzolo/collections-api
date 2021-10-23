package com.debugger.collections.api.numbers;

import java.util.*;

public class Numbers {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1000, 200, 2700, 3000, 400, 600, 2500, 800);

		NavigableSet<Integer> numberTree = new TreeSet<>(numbers);

		numberTree.descendingSet().stream().forEach(System.out::println);
		System.out.println();

		// All numbers below 200
		numberTree.headSet(2000).stream().forEach(System.out::println);
		

		// All numbers above 2000
		numberTree.tailSet(2000).stream().forEach(System.out::println);
		
		// All numbers between above 1500 and > 3000
		numberTree.subSet(1500, 3000).stream().forEach(System.out::println);

	}

}

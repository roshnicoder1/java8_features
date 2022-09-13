package com.self.Stream;

import java.util.List;
import java.util.stream.Collectors;

public class CollectorsImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		
		List<Integer> squaredNumbers = squareList(numbers);
		
		System.out.println(squaredNumbers);
		List<Integer> evenNumbersOnly= evenNumberList(numbers);
		System.out.println("Even Numbers only:"+evenNumbersOnly);
	}

	private static List<Integer> evenNumberList(List<Integer> numbers) {
		// TODO Auto-generated method stub
		return numbers.stream().filter(x->x%2==0).collect(Collectors.toList());
	}

	private static List<Integer> squareList(List<Integer> numbers) {
		// TODO Auto-generated method stub
		
		
		return numbers.stream().map(x->x*x).collect(Collectors.toList());
	}

}

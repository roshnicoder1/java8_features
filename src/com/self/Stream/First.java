package com.self.Stream;

import java.util.List;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
//		printAllNumbersInListFunctional(list);
//		printAllEvenNumbers(list);
//		printAllOddNumbers(list);
//		printSquaresOfEvenNumbersInListFunctional(list);
		System.out.println(addListFunctional1(list));
		

	}

	private static int addListFunctional1(List<Integer> list) {
		// TODO Auto-generated method stub
		return list.stream().reduce(0,First::sum);
		
	}

	private static void printSquaresOfEvenNumbersInListFunctional(List<Integer> list) {
		// TODO Auto-generated method stub
		list.stream().filter(x->x%2==0).map(x->x*x).forEach(System.out::println);// Method Reference
		
	}

	private static void printAllOddNumbers(List<Integer> list) {
		// TODO Auto-generated method stub
		list.stream().filter(x->x%2==1).forEach(System.out::println);
		
	}

	private static void printAllEvenNumbers(List<Integer> list) {
		// TODO Auto-generated method stub
		list.stream().filter(x->x%2==0).forEach(System.out::println);
		
	}

	private static void printAllNumbersInListFunctional(List<Integer> list) {
		// TODO Auto-generated method stub
		list.stream().forEach(System.out::println);
		
	}
	private static int sum(int aggregate, int nextNumber) {
		System.out.println(aggregate + " " + nextNumber);
		return aggregate + nextNumber;
	}
	private static int addListFunctional(List<Integer> numbers) {
		//Stream of number -> One result value
		  //Combine them into one result => One Value
		  // 0 and FP02Functional::sum
		return numbers.stream()
				.parallel()
		  //.reduce(0, FP02Functional::sum);	
		  // .reduce(0, (x,y) -> x + y);
			.reduce(0, Integer::sum);
	}

}

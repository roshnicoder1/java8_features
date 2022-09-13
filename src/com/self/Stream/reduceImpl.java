package com.self.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

/*
 * Many times, we need to perform operations where a stream reduces to single resultant value, for example, maximum, minimum, sum, product, etc. Reducing is the repeated process of combining all elements.

reduce operation applies a binary operator to each element in the stream where the first argument to the operator is the return value of the previous application and second argument is the current stream element.

Syntax :

T reduce(T identity, BinaryOperator<T> accumulator);

Where, identity is initial value 
of type T and accumulator is a 
function for combining two values.
 */

public class reduceImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
//		System.out.println(addListFunctional1(list));
		
		System.out.println(findSumOfSquaresInList(list));
		

		// Implementation of reduce method
		// to get the longest String
		 List<String> words = Arrays.asList("GFG", "Geeks", "for",
                 "GeeksQuiz", "GeeksforGeeks");
		Optional<String> s= getLongestStringInList(words);
		
		// Implementation of reduce method
		// to get the combined String
		String[] array = { "Geeks", "for", "Geeks" };
		Optional<String> merged =getCombinedString(array);
		productOfNumIngivenRange();

	}
	private static int findSumOfSquaresInList(List<Integer> list) {
		// TODO Auto-generated method stub
//		list.stream().map(x->x*x).reduce(0,(x,y)->x+y);
		return list.stream().map(x->x*x).reduce(0,(x,y)->x+y);
	}
	private static void productOfNumIngivenRange() {
		// TODO Auto-generated method stub
		 // To get the product of all elements
        // in given range excluding the
        // rightmost element
		int product=IntStream.range(2, 8).reduce(1, (x,y)->x*y);
		System.out.println(product);
	}
	private static Optional<String> getCombinedString(String[] array) {
		// TODO Auto-generated method stub
		Optional<String> combinedstr= Arrays.stream(array).reduce((str1,str2)->str1+"-"+str2);
		combinedstr.ifPresent(System.out::println);
		
		return combinedstr;
	}
	private static Optional<String> getLongestStringInList(List<String> words) {
		// TODO Auto-generated method stub
		 // The lambda expression passed to
        // reduce() method takes two Strings
        // and returns the longer String.
        // The result of the reduce() method is
        // an Optional because the list on which
        // reduce() is called may be empty.
        Optional<String> longestString = words.stream()
                                   .reduce((word1, word2)
                             -> word1.length() > word2.length()
                                           ? word1 : word2);
  
        // Displaying the longest String
        longestString.ifPresent(System.out::println);
        return  longestString;
	}
	private static int addListFunctional1(List<Integer> list) {
		// TODO Auto-generated method stub
//		return list.stream().reduce(0,reduceImpl::sum);
		//or
		return list.stream().reduce(0, (x,y)->x+y);

		
		
	}
	private static int sum(int aggregate, int nextNumber) {
		System.out.println(aggregate + " " + nextNumber);
		return aggregate + nextNumber;
	}

}

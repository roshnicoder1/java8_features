package com.self.Stream;

import java.util.Arrays;
import java.util.stream.Stream;

/*
 * Input: Stream = {“Geek_First”, “Geek_2”, “Geek_3”, “Geek_4”, “Geek_Last”}
Output: Geek_First

Input: Stream = {1, 2, 3, 4, 5, 6, 7}
Output: 1
 */
public class FirstElementOfStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] input={"Geek_First", "Geek_2", "Geek_3", "Geek_4", "Geek_Last"};
		Stream<String> inputStream=Arrays.stream(input);
		findFirstElementStream(inputStream);
		

	}

	private static void findFirstElementStream(Stream<String> inputStream) {
		// TODO Auto-generated method stub
		inputStream.reduce((x,y)->x).ifPresent(System.out::println);
		
		
		//or use stream Using Stream findFirst() Method: The findFirst() method will returns the first element of the stream or an empty if the stream is empty.
		  
        // findFirst() method returns
        // the first element of stream
//        .findFirst()

        // if stream is empty
        // null is returned
//        .orElse(null);
		
	}

}

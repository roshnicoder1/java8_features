package com.self.Stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class FindLastElementOfStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] input={"Geek_First", "Geek_2", "Geek_3", "Geek_4", "Geek_Last"};
		Stream<String> inputStream=Arrays.stream(input);
		findLastElementStream(inputStream);

	}

	private static void findLastElementStream(Stream<String> inputStream) {
		// TODO Auto-generated method stub
		inputStream.reduce((x,y)->y).ifPresent(System.out::println);
		
	}

}

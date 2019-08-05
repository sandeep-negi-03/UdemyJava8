package com.functionalinterface.function;

import java.util.function.Function;

public class ApplyDemo {

	public static void main(String[] args) {
		
		Function<String, Integer> length = s->s.length();
		
		System.out.println("Length of Sandeep : " + length.apply("Sandeep"));

		Function<Integer, Integer> sqr = i->i*i;
		System.out.println("Square of 25 : " + sqr.apply(25));
		
		//To return a String without Spaces
		Function<String, String> StringWithoutSpaces = s->s.replaceAll(" ", "");
		System.out.println("StringWithoutSpaces " + StringWithoutSpaces.apply("Hello There") );
		
		
	}
	
}

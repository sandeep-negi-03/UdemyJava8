package com.functionalinterface.function;

import java.util.function.Function;

public class FunctionChainingDemo {

	
	public static void main(String[] args) {
		
		Function<String, String> uppercaseFunc = s->s.toUpperCase();
		Function<String, String> substringFunc = s->s.substring(1, 4);
		
		System.out.println(uppercaseFunc.apply("Sandeep"));
		System.out.println(substringFunc.apply("Sandeep"));
		
		System.out.println(uppercaseFunc.andThen(substringFunc).apply("Sandeep"));
		System.out.println(uppercaseFunc.compose(substringFunc).apply("Sandeep"));
		
		Function<Integer, Integer> addfunc = i -> i+i;
		Function<Integer, Integer> mulfunc = i -> i*i;
		
		System.out.println("and then : " + addfunc.andThen(mulfunc).apply(2));
		System.out.println("compose : " + addfunc.compose(mulfunc).apply(2));
		
	}
	
}

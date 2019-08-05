package com.functionalinterface.predicate;

import java.util.function.Predicate;

public class PredicateIsEqual {

	public static void main(String[] args) {
		
		Predicate<String> pred = Predicate.isEqual("Sandeep");
		System.out.println(pred.test("Sandeep"));
		System.out.println(pred.negate().test("Sandeep"));
	}
	
}

package com.functionalinterface.predicate;

import java.util.function.Predicate;

public class PredicateStartWithK {

	public static void main(String[] args) {
		
		String [] names = {"Kareena", "Mallika", "Sunny", "Katrina", "Kriti" };
		
			Predicate<String> startsWithK = i->i.charAt(0) == 'K';
			
			System.out.println("Names Start with K");
			
			for(String s:names) {
				if(startsWithK.test(s)) {
					System.out.println(s);
				}
			}
	}
	
}

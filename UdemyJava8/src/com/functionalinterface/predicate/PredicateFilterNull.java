package com.functionalinterface.predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateFilterNull {

	public static void main(String[] args) {
		String [] names = {"Kareena", "Mallika", "Sunny", "", "Kriti", null };
		
		Predicate<String> pred = i->i!= null && i.length()>0;
		
		ArrayList< String> al = new ArrayList<>();
		
		
		for(String s:names) {
			if(pred.test(s)) {
			System.out.println(s); 
				al.add(s);
			}
		}
		
		System.out.println(al);
	} 
	
	
}

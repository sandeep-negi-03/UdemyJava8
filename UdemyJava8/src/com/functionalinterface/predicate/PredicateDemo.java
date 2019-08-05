package com.functionalinterface.predicate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		
		Predicate<Integer> pred1 = i->i>10;
		System.out.println(pred1.test(2));
//		System.out.println(pred1.test("Hi"));-- The method test(Integer) in the type Predicate<Integer> is not applicable for the arguments (String)
		
		Predicate<Collection> pred2 = i->i.isEmpty();
		ArrayList<String> l1 = new ArrayList<String>();
		l1.add("Hi");
		System.out.println(pred2.test(l1));
		
		ArrayList<String> l2 = new ArrayList<String>();
		System.out.println(pred2.test(l2));
		
		Predicate<Integer> pred3 = i->i%2==0;
		System.out.println("check even : " + pred3.test(2));
		System.out.println("check negate : " + pred3.negate().test(2));
		
		
		
		int[] x = {1,5,10,15,20,25,30};
		
		System.out.println("Numbers not greater than 10");
		m1(pred1.negate(),x);
		
		System.out.println("Numbers greater than 10 and even");
		m1(pred1.and(pred3), x);
		
		System.out.println("Numbers greater than 10 or even");
		m1(pred1.or(pred3), x);
		
	}
	
	public static void m1(Predicate<Integer> p, int[] x) {
		for(int i : x) {
			if(p.test(i)) {
				System.out.println(i);
			}
		}
	}
	
}

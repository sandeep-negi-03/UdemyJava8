package com.functionalinterface.function;

import java.util.function.Function;

public class IdentityDemo {

	public static void main(String[] args) {
		
		Function<String, String> idenFunc = Function.identity();
		
		System.out.println("IdenFunc : " + idenFunc.apply("Sandeep"));
	}
	
}

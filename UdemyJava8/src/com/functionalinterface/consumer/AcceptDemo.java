package com.functionalinterface.consumer;

import java.util.function.Consumer;

public class AcceptDemo {

	public static void main(String[] args) {
		
		Consumer<String> printFunc = s->System.out.println(s);
		
		printFunc.accept("Hello");
		
	} 
	
	
}

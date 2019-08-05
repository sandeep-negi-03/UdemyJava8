package com.lamdaexpression.interfaces;

interface Intref23{
	public static void m1() {
		System.out.println("Interface static method");
	}
}

public class DefaultStaticMethodDemo implements Intref23{ // -- implements Intref23 is optional

	public static void main(String[] args) {
		
		DefaultStaticMethodDemo test = new DefaultStaticMethodDemo();
//		test.m1(); -- The method m1() is undefined for the type DefaultStaticMethodDemo
//		DefaultStaticMethodDemo.m1(); -- The method m1() is undefined for the type DefaultStaticMethodDemo
		
		Intref23.m1();
	}
	
	
}

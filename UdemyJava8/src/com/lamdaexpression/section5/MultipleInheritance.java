package com.lamdaexpression.section5;

interface One{
	public default void m1() {
		System.out.println("one m1 method");
	}
}

interface Two{
	public default void m1() {
		System.out.println("two m1 method");
	}
}

public class MultipleInheritance implements One, Two {

	
	public static void main(String[] args) {
		MultipleInheritance test = new MultipleInheritance();
		test.m1();
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		One.super.m1();
		Two.super.m1();
	}
}

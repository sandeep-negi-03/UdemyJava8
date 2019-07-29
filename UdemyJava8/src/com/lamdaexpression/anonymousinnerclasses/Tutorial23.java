package com.lamdaexpression.anonymousinnerclasses;

interface Intref23{
	public void m1();
}

public class Tutorial23 {

	int x = 20;
	
	public void m2() {
		int y =30;
		
		Intref23 i = ()->{
			System.out.println("x : " + x);
			System.out.println("y : " + y);
//			y = 99; -- Local variable y defined in an enclosing scope must be final or effectively final
			x =99;
			System.out.println("mod x : " + x);
		};
		i.m1();
	}
	
	public static void main(String[] args) {
		Tutorial23 test = new Tutorial23();
		test.m2();
	}
	
}

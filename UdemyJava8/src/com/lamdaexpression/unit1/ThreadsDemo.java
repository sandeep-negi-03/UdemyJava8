package com.lamdaexpression.unit1;

public class ThreadsDemo {

	public static void main(String[] args) {
		Runnable r = ()->{
				for(int i = 0;i<10;i++){
					System.out.println("Child Thread");
				}
		};
		
		Runnable r1 = ()->System.out.println("Hi");;
		
		Thread t = new Thread(r);
		Thread t2 = new Thread(r1);
		t.start();
		t2.start();
		for(int i = 0;i<10;i++){
			System.out.println("Main Thread");
		}
	}
}

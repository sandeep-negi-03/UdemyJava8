package com.lamdaexpression.com;

import java.util.TreeSet;

public class TreeSetSortingDemo {

	public static void main(String[] args) {
		TreeSet<Integer> tSet  = new TreeSet<>(
				(i1,i2)->(i1>i2)?-1:(i1<i2)?1:0);
		tSet.add(10);
		tSet.add(0);
		tSet.add(25);
		tSet.add(20);
		tSet.add(15);
		tSet.add(5);
		
		System.out.println(tSet);
	}

}

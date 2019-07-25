package com.lamdaexpression.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ListSortingDemo {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(0);
		list.add(15);
		list.add(5);
		list.add(20);
		
		System.out.println("Before Sorting : " + list);
		Collections.sort(list);
		System.out.println("After Sorting : " + list);
		/*Collections.sort(list, new MyComparator());
		System.out.println("After Sorting in Desc Order : " + list);*/
		Collections.sort(list, (i1,i2)->(i1>i2)?-1:((i1<i2)?+1:0));
		System.out.println("After Sorting in Desc Order with lamda : " + list);
	}

	
	
}

class MyComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		return (o1>o2)?-1:((o1<o2)?+1:0);
	}
	
}
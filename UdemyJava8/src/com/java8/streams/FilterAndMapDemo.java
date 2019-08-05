package com.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterAndMapDemo {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(0);
		list.add(15);
		list.add(10);
		list.add(5);
		list.add(25);
		list.add(20);
		
		List<Integer> newList = list.stream().filter(i->i%2==0).collect(Collectors.toList());
				
		newList.forEach(System.out::println);
		
		List<Integer> newList2 = list.stream().map(i->i*2).collect(Collectors.toList());
		newList2.forEach(i->System.out.println("Element multiplied with 2 : " + i));
		
	}
}

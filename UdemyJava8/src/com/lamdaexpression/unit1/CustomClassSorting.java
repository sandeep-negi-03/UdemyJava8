package com.lamdaexpression.unit1;

import java.util.ArrayList;
import java.util.Collections;

public class CustomClassSorting {
	
	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<Employee>();
		
		list.add(new Employee(3, "Lalit"));
		list.add(new Employee(1, "Sandeep"));
		list.add(new Employee(2, "Abhi"));
		
		
		System.out.println("Before sorting : " + list);
		
		Collections.sort(list, (e1,e2)->(e1.eno<e2.eno)?-1:(e1.eno>e2.eno)?1:0);
		
		System.out.println("After sorting : " + list);
	}
}


class Employee{
	int eno;
	String ename;
	
	public Employee(int eno, String ename) {
		this.eno = eno;
		this.ename = ename;
	}
	
	public String toString() {
		return eno + " : " + ename;
	}
}
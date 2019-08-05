package com.functionalinterface.predicate;

import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateUserAuthentication {

	public static void main(String[] args) {
		
		Predicate<User> pred = user->user.username.equals("Durga") && user.password.equals("Java");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter UserName : ");
		String username = sc.next();
		
		System.out.println("Enter Password : ");
		String password = sc.next();
		
		User user = new User("Durga", "Java");
		
		if(pred.test(user)) {
			System.out.println("Allowed");
		}else {
			System.out.println("Not Allowed");
		}
		
	}
	
}

class User{
	String username;
	String password;
	
	User(String username, String password){
		this.username = username;
		this.password = password;
	}
}

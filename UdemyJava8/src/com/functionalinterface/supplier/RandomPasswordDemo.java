package com.functionalinterface.supplier;

import java.util.function.Supplier;

/**
 * To Generate 8 digit password where 
 * 2,4,6,8 are only digits
 * 1,3,5,7 only Upper Case alphabets or symbols only @, #, $
 * @author sannegi6
 *
 */

public class RandomPasswordDemo {

	public static void main(String[] args) {
		
		Supplier<String> supplier = ()->{
			String password = "";
			Supplier<Integer> digit = ()->(int)(Math.random()*10);
			String symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZ@#$";
			Supplier<Character> symbol = ()->symbols.charAt((int)(Math.random()*29));
			
			for(int i=0;i<8;i++) {
				if(i%2==0) {
					password += digit.get();
				}
				else {
					password += symbol.get();
				}
			}
			return password;
		};
	
		
		System.out.println(supplier.get());
		
	}
}

package com.functionalinterface.supplier;

import java.util.function.Supplier;

public class RandomOtpDemo {

	public static void main(String[] args) {
		
		Supplier<String> supplier = ()->{
							String otp = "";
							for(int i=0;i<6;i++) {
								otp += (int)(Math.random()*10);
							}
							return otp;
		};
		
		System.out.println("Random OTP : " + supplier.get());
		
	}
	
}

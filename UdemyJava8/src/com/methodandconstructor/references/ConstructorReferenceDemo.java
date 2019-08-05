package com.methodandconstructor.references;

public class ConstructorReferenceDemo {

	public static void main(String[] args) {
		
		Intref i = Sample::new;
		i.get();
	}
}

interface Intref{
	public Sample get();
}

class Sample{
	public Sample() {
		System.out.println("Sample class constructor");
	}
	
}
package com.functionalinterface.consumer;

import java.util.function.Consumer;

public class ConsumerChainingDemo {

	Consumer<Movie> cFunc1 = s->System.out.println("Function1 : " + s.name + " : " + s.result); 
	Consumer<Movie> cFunc2 = s->System.out.println("Function2 : " + s.name + " : " + s.result);
	Consumer<Movie> cFunc3 = s->System.out.println("Function3 : " + s.name + " : " + s.result);
	
	Consumer<Movie> cChain = cFunc1.andThen(cFunc2).andThen(cFunc3);
	
	public static void main(String[] args) {
		
		Movie movie = new Movie("Abc", "XYZ");
		ConsumerChainingDemo c = new ConsumerChainingDemo();
		c.cChain.accept(movie);
		
	}
	
}


class Movie{
	
	String name;
	String result;
	
	Movie(String name, String result){
		this.name = name;
		this.result = result;
	}
	
}